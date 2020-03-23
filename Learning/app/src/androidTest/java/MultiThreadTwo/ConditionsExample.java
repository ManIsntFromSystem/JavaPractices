package MultiThreadTwo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionsExample {

    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();//аналог того как мы используем wait() and notify()
    //когда испульзуем lock то нужно использовать и Conditions

    static int account = 0;
    public static void main(String[] args) throws InterruptedException{
        new AcountMinus().start();
        new AcountPlus().start();
    }

    static class AcountPlus extends Thread{
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class AcountMinus extends Thread{
        @Override
        public void run() {
            if (account < 10){
                try {
                    lock.lock();
                    System.out.println(account);
                    condition.await();
                    System.out.println("Account = " + account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(account);
            account -= 10;
        }
    }
}
