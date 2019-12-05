package Multitreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MySheduleExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MyThread(), 1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Run");
        }
    }
}
