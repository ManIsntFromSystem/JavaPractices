package Multitreading;

import java.util.concurrent.*;

public class MyExecutors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();
        //executorService.shutdownNow();
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("Run");
        }
    }
    static class MyCallable implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "Call";
        }
    }
}
