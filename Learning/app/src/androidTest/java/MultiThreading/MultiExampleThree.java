package MultiThreading;

import java.util.Locale;

public class MultiExampleThree {
    /*
    * КОгда поток создается он копирует переменные себе(кеширует их)
    * Volatile непосредственно записует данные в переменные в MAIN в основную точку в памяти
    * Поток будет рабока без кэша*/

    volatile static int i = 0;
    public static void main(String[] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    static class MyThreadWrite extends Thread{
        @Override
        public void run() {
            while (i < 5){
                System.out.println("increment i to " + (++i));
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThreadRead extends Thread{
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5){
                if (localVar != i ){
                    System.out.println(" new value is" + i);
                    localVar = i;
                }
            }
        }
    }
}
