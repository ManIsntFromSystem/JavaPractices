package MultiThreadThree;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import javax.xml.transform.Source;

public class ForkJoinFrameworkEx {

    static long numOfOperations = 10_000_000_000L;

    static int numOfThread = Runtime.getRuntime().availableProcessors();//вернет количество ядер

    public static void main(String[] args) throws Exception{
        System.out.println(numOfThread);
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool(numOfThread);//Пул потоков который позволяет разделять оперции на несколько частей
        System.out.println(pool.invoke(new MyFork(0, numOfOperations)));// нужно передать ему клас который будет выполнять
        System.out.println(new Date());
    }

    static class MyFork extends RecursiveTask<Long>{
        long from, to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {//будет делать весь подсчет
            if((to - from) <= numOfOperations / numOfThread){
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;
                }
                return j;
            }else {
                long middle = (to + from) / 2;
                MyFork firstHalf  = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
            /*if(если операция разбита на достаточное колличество частей){
                выполняем операцию
            }else {
                разбиваем на части поменьше
            }*/
        }
    }
}



/* long j = 0;
        for (long i = 0; i < numOfOperations; i++) {
            j += i;
        }
        System.out.println(j);*/