package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomVariableExample {
    //есть Атомарные обертчики Ato,icInteger i td

    /*int i;
    Integer I;//Неатамарные
    */
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws Exception{
        for (int j = 0; j < 10_000; j++) {
            new MyThreadAt().start();
        }
        Thread.sleep(2000);
        System.out.println(atomicInteger.get());
    }

    static class MyThreadAt extends Thread{
        @Override
        public void run() {
            atomicInteger.incrementAndGet();//атомарная операция
            //i = 5;//не атомарная
        }
    }
}
