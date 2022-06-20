package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaThreadPoolDemo {
    public static void main(String[] args){
        //Predefined ThreadPool
        ExecutorService threadPool1 = Executors.newFixedThreadPool(5); // core = 5; max = 5
        ExecutorService threadPool2 = Executors.newSingleThreadExecutor(); // core = 1; max = 1;
        ExecutorService threadPool3 = Executors.newCachedThreadPool();// core = 0, max = Integer.MAX_VALUE
        ExecutorService threadPool4 = Executors.newScheduledThreadPool(3);// core = 3, max = max_value
    }

}
