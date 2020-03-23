package MultiThreadTwo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecuterServiseExample {//Запуск потока по расписанию
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MuThreadSix(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }

    static class MuThreadSix extends Thread{
        @Override
        public synchronized void start() {
            System.out.println("Ssss");
        }
    }
}
