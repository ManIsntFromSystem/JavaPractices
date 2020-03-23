package MultiThreadTwo;

public class WaitAndNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        //Wait() - ждет пока работающий поток не вызовет у себя метод notify() or notifyAll() нотифицируют(сообщат что они закончили выполнение задачи какойто),
        // а после потоки которые ждут с методом wait() приступят к выполнению выйдя из пула потоков в работу но только однин и до тех пор пока не вызовет у себя метод notify()
        //wait and notifyy должны быть вызваны из синхронизированного контекста
        //синхронизация должна ыть на том же самом обьекте
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB){
            threadB.wait();
        }
        System.out.println(threadB.total);
    }
    static class ThreadB extends Thread{
        int total;

        @Override
        public void run() {
            synchronized (this){
                for (int i = 0; i < 5; i++) {
                    total += i;
                    try{
                        sleep(500);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                notify();
            }
        }
    }
}
