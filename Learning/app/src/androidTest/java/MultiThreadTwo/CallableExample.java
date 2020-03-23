package MultiThreadTwo;

import android.support.annotation.NonNull;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableExample {//нтерфейс Callable заменяет Runnable(хотяф работает на его основе)
    public static void main(String[] args) throws Exception{
        Callable<Integer> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);//имплементит -> FuterTask -> Runable and Futures
        new Thread(futureTask).start();
        System.out.println(futureTask.get());//зависнет и будт ждать пока callable  не выполнится /*АНАЛОГ JOIN*/
    }

    static class MyCallable implements Callable<Integer>{//помимо того что бюы запутить tsk нужно еще и вернуть какой то результат
        @Override
        public Integer call() throws Exception {
            int j = 0;
            for (int i = 0; i < 10; i++, j++) {
                Thread.sleep(200);
            }
            return j;
        }
    }
}
