import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class OneLaneBridge {
    private static final int Cars = 5;
    private static ExecutorService executor = Executors.newFixedThreadPool(10);
    private static Semaphore semaphore = new Semaphore(1);
    public static void main(String[] args) {
        for (int i = 0; i < Cars; i += 2) {
            executor.execute(new Car("eastbound vehicle"));
            executor.execute(new Car("westbound vehicle"));
        }
        executor.shutdown();
    }

    static class Car implements Runnable {

        private String name;
        public Car(String s){
            this.name = s;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println(this.name  + " is driving on the bridge.");
                Thread.sleep(1000);
                System.out.println(this.name + " is going end of the bridge.");
                semaphore.release();
                System.out.println(this.name + " is out of bridge.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
            }
        }

    }
}
