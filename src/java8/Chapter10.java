package java8;

import java.util.Random;
import java.util.concurrent.*;

public class Chapter10 {
    public static void main(String[] args) {

//        new Chapter10().test();
        try {
            System.out.println(new Chapter10().getPriceAsync("").get(2, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
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
        new Thread(() -> System.out.println("get price"));
        return new Random().nextDouble();
    }

    private Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread(() ->
        {
            delay();
            double price = new Random().nextDouble();
            futurePrice.complete(price);
        }).start();
        return futurePrice;
    }

    public Future<Double> getPriceSupplyAsync() {
        return CompletableFuture.supplyAsync(() -> {
            delay();
            return new Random().nextDouble();
        });
    }
}
