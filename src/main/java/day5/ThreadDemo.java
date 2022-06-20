package day5;

import java.awt.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void  main(String[] args) throws ExecutionException, InterruptedException {
        ThreadBased t1 = new ThreadBased();
        t1.start();

        Thread t2 = new Thread( new RunnableBased());
        t2.start();

        FutureTask ft = new FutureTask(new CallableBased());
        Thread t3 = new Thread(ft);
        t3.start();
        System.out.println(ft.get());

        //lambda function
        Thread t21 = new Thread(()->{
            System.out.println("123 321");
        });
        t21.start();

        Thread t4 = new Thread(() ->
        {
            for (int i = 0; i < 4; i++){
                System.out.println(i);
            }
        });

        t4.start();
    }

}

class ThreadBased extends Thread{
    public void run(){
        System.out.println("Extends Thread class,   the current thread is:" + Thread.currentThread().getName());
    }
}

class RunnableBased implements Runnable{
    @Override
    public void run(){
        System.out.println("Extends Runnable class, the current thread is:" + Thread.currentThread().getName());
    }
}

class CallableBased implements Callable {
    @Override
    public Integer call() throws Exception{
        System.out.println("Extends callable class, the current thread is:" + Thread.currentThread().getName());
        return 114;
    }
}