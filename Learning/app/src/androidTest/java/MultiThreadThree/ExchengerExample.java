package MultiThreadThree;

import java.util.concurrent.Exchanger;

public class ExchengerExample {
    //нужн для синхронизации и обена сообщениями между потоками
    public static void main(String[] args) throws InterruptedException{
        Exchanger<String> exchanger = new Exchanger<>();

        new Mike(exchanger);
        new Anket(exchanger);
    }

    static class Mike extends Thread{
            Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Hi my name is Mike");//выполнился и ждет ответа от нижнего
                Thread.sleep(3000);//ждет
                exchanger.exchange("I'm 20 years old");//после выполнения 2-го

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Anket extends Thread{
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));//ждет сообщение
                System.out.println(exchanger.exchange(null));//ждет сообщение - оно выведется через 3 секунды
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
