package MultiThreadThree;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryEx {//interface нужен для работы с однрородными потоками, чтобы настроить их как то однообразно
    //для настройки потоков, делать с ними одни и те же действия
    public static void main(String[] args) throws Exception {
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
        threadFactory.newThread(new MyRun());
    }

    static class MyRun implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
