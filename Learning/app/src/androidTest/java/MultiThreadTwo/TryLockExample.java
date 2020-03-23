package MultiThreadTwo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new MyThreadThree().start();
        new MyThreadFour().start();
    }

    static class MyThreadThree extends Thread{
        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + " start working");
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " stop working");
            lock.unlock();
            System.out.println(getName() + " lock is released");
        }
    }

    static class MyThreadFour extends Thread{
        @Override
        public void run() {
            System.out.println(getName() + " begin working");
                 while (true){
                    if (lock.tryLock()){//будет спрашивать первый поток о том - можно ли работать(освобожден ли ресурс)
                        //пока нет - он будет выводить waiting
                        //как только закончит первый тогда выполнится этот и выйдет
                        System.out.println(getName() + " working");
                        break;
                    } else {
                        System.out.println(getName() + " waiting");
                    }
                }
        }
    }
}
