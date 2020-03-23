package MultiThreadTwo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {//актуально для програм с тысячами потоков

    //для этого есть решение в виде Executors они создают threadPool(пул потоков)
    // там он гоняет одни и те же потоки что бы не создавать новые
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunable());
        System.out.println(executorService.submit(new MyCallable()).get());//здесь как и любой другой Callable вернет нам Futurs
        //если не выполнить метод shutDown();(заершение всех потоков)
        // -> threadPool  у нас не завершится
        //shutDownNow - не ждет заершения потоков, он просто прекращает выполение
        executorService.shutdown();
    }

    static class MyRunable implements Runnable{

        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}

