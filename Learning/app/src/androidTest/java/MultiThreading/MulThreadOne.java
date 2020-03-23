package MultiThreading;

public class MulThreadOne{
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
       // myThread.join();//пока не закончит выполнение поток -MyThread , не будет выпполнятся поток Main
        //myThread.setPriority(Thread.MAX_PRIORITY);
        //Thread.yield();//запускает дргуой поток, делится временемс менее приоритетными потоками // он статический -> тллько на текущем потоке
        System.out.println("Thread main");

       /* try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread main");*/
    }
}
     class MyThread extends Thread {
         @Override
         public void run() {
             for (int i = 0; i < 30; i++) {
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }

                 System.out.println(i);
             }
         }
     }