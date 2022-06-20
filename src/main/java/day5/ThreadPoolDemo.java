package day5;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args){
       ExecutorService threadpool =  new ThreadPoolExecutor(
               2,
               5,
               2L,
               TimeUnit.SECONDS,
               new ArrayBlockingQueue<>(4),
               Executors.defaultThreadFactory(),
               new ThreadPoolExecutor.AbortPolicy()
       );

       for (int i = 1; i <= 9; i++){
           threadpool.execute(
                   ()->{
                       System.out.println(Thread.currentThread().getName() +
                               " dealing with the business");
                   }
           );
       }

        threadpool.shutdown();
    }
}
