package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiColectExamp {
    //https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/package-summary.html

    //List list = new Collections.synchronizedList(new ArrayList<>());//все методы в List делает синхронизированными
    //Когда лист шарится между потоками но не стоит
    //Лучше обычные ллисты и синхрон  клонировать колекцию

   /* public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.add("first");
        class MyThreadOne extends Thread{
            @Override
            public void run() {
                System.out.println(nameList.removeFirst());
            }
        }
        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.setName("one");
        myThreadOne().start();
        new MyThread().start();
    }

    static class NameList{
       private List list = new ArrayList<>();

       public void add(String name){
            list.add(name);
       }

       public synchronized String removeFirst(){
           if(list.size() > 0){
               return (String)list.remove(0);
           }
           return null;
       }
    }*/
}
