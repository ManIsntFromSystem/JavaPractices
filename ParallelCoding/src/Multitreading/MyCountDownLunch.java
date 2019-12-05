package Multitreading;

import javax.crypto.spec.PSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

public class MyCountDownLunch {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
    }

    static class Work extends Thread{
        CountDownLatch countDownLatch;

        public Work(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
            start();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("done work. ");
            countDownLatch.countDown();
        }
    }
}
