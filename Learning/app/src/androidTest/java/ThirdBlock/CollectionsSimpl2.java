package ThirdBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import javax.xml.transform.Source;
    class Books {
        String name;

        public Books(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Books{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
public class CollectionsSimpl2 {

    public static void main(String[] args) {
        /*
         * Отсортированные // ThreeSet();
         * Упорядочеванные // запоминают порядок элементов, хранит ссылки
         * Неупорядоченные HashSet(); // - как угодно выведет;  LinkedHashSet для упорядочевания вместо HashSet
         * */


        Map col1 = new HashMap();//добавляет значение по ключу
        //нет add
        //не наследуется от Collections
        //значение ключ
        //put(), get(), size()
        //можно с обьектоми в виде ключей но они должны переопределять hashcde and equals
        col1.put("1", "Dan Brown");
        col1.put("2", new Books("Karnagi"));
        col1.put("3", "Jack London");
        System.out.println(col1.get("2"));
        Set set = col1.keySet();
        for (Object o : set) {
            System.out.println(o);
        }




/*
        Set col1 = new HashSet();//
        //колекция уникальных обьектов
        col1.add("1");
        col1.add("2");
        col1.add("3");
        col1.add("3");
        col1.add("3");
        col1.add("3");
        col1.add("3");
        for (Object o : col1){
            System.out.println(o);//каждый элемент в set добавляется только один раз
            //для бд круто,
        }
*/



        /* Queue col1 = new PriorityQueue();//
        //очереди
        col1.offer("1");
        col1.offer("2");
        col1.offer("3");
        Iterator iterator = col1.iterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            System.out.println(col1.poll());
        }
        /*for (int i = 0; i <= col1.size(); i++ ){
            System.out.println(col1.peek());
        }*/
       // System.out.println("num of element: " + col1.size());


        /**
         *
         *
         *
         *
         *
         */





        //int[] arr = new int[10]; //быстрый доступ, но память ограничена
        //Collections collections;
        //Arrays arrays;
        //Collection пришли на смену масивам
        /*  List col1 = new ArrayList();
        Set coll2 = new HashSet();
        Queue coll3 = new PriorityQueue();
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.remove("2");
        Iterator iterator = collection.iterator(); // все колекции имеют этот интерфейс позволяет пробегать по колекции
        for(Object o : collection) {
            System.out.println(o);
        }
        /*while (iterator.hasNext()) { //уже не использую while
            System.out.println(iterator.next());
        }*/






       /*
       *
       *
       *
       * */





       /* List col1 = new ArrayList();//берутся по значениям как Array
        //это колекция на основе индексов
        col1.add("1");
        col1.add("2");
        col1.add("3");
        col1.set(2, "33");
        col1.add(2, "22");
        for (int i = 0; i < col1.size(); i++) {
            System.out.println(col1.get(i));
        }
        System.out.println(col1.get(1));*/
    }
}
