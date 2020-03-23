package MultiThreadThree;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    //есть несколько потоков и хочу чтобы они все выполнили каккуюто работу(посчитали данные или записали их кудато) и лишь только потом хочу использовать эти данные
    //в нем есть 2 метода await and countDown
    //countDown()
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch countDownLatch = new CountDownLatch(3);//Счетчик. указываем число потоков, которые долдны завершится
       // countDownLatch.countDown(); //после выполения работы мы будем уменьшать на еденицу
       // countDownLatch.await();//бужет ждать до тех пор пока счетчик не достигнет 0
        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);

        countDownLatch.await();
        System.out.println("All jobs done");
    }
}

class Work extends Thread {
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done work");
        countDownLatch.countDown();
    }
}
