package MultiThreadTwo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample{
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i = 5;
        resource.j = 7;

        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.setName("one");
        MyThreadTwo myThreadTwo2 = new MyThreadTwo();
        myThreadTwo.resource = resource;
        myThreadTwo2.resource = resource;
        myThreadTwo.start();
        myThreadTwo2.start();
        myThreadTwo.join();
        myThreadTwo2.join();
        System.out.println(resource.i);
        System.out.println(resource.j);
}

    static class MyThreadTwo extends Thread{
    Resource resource;
    @Override
    public void run(){
        resource.changeI();
        resource.changeJ();
        }
    }
}

class Resource {
    int i;
    int j;

    Lock lock = new ReentrantLock();//

    void changeI() {
        lock.lock();
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) {//здесь будут прерывать друг друга потоки и вывыдводить разное зачение каждыйц раз
            Thread.yield();
        }
        i++;
        this.i = i;
        //lock.unlock();//можно залочить несколько методов(в одном вызвали а в другом закрыли lock) в один lock(гибкость многопоточности)
        //можно даже так
        changeJ();
    }

    void changeJ() {
        //lock.lock();
        int j = this.j;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        j++;
        this.j = j;
        lock.unlock();
    }
}