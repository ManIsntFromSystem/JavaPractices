package MultiThreadThree;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueueEx {
    public static void main(String[] args) throws InterruptedException{
        final BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println(queue.take());//блокируется поток до тех пор пока мы не положим туда //
                    // вызываем take() - он уходит в спыящий режим wait() и ждует пока не запустится add() а после него вызовится notify()
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                queue.add("This is String");
            }
        }.start();
    }
}
