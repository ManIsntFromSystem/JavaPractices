package MultiThreadThree;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarierExample {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());//как только все три потока соберутся и вызовут матод await() -> только тогда выполнится метод run();
        new SportsMan(cyclicBarrier);
        new SportsMan(cyclicBarrier);
        new SportsMan(cyclicBarrier);
    }
    static class Run extends Thread{
        @Override
        public void run() {
            System.out.println("Run is begun");//выполнится в самом конце
        }
    }

    static class SportsMan extends Thread{
        CyclicBarrier barrier;

        public SportsMan(CyclicBarrier barrier) {
            this.barrier = barrier;
            start();
        }

        @Override
        public synchronized void start() {
            try {
                barrier.await();//ждем пока соберутся все 3 спортсмена и только тогда можно вызвать метод run() в класе Run
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
