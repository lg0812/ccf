package java8;

import java.util.Random;
import java.util.concurrent.*;

public class Chapter10 {
    public static void main(String[] args) {
        new Chapter10().test();
    }

    public void test() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Double> future = executorService.submit(() -> {
            return new Double(100);
        });

        try {
            Double result = future.get(1, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private double getPrice(String product) {
        delay();
        new Thread(() -> System.out.println());
        return new Random().nextDouble();
    }
}
