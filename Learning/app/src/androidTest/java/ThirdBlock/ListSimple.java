package ThirdBlock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSimple {
    public static void main(String[] args) {//interface
        List list = new ArrayList();//колекция на основании индексов impel Lists impl Collections, элементы один за другим. строится на основании обычного масива
        System.out.println(list.size());
        List list1 = new Vector();// тот же FrrayList только все его методы синхронизированны,
        List list2 = new LinkedList();// Двунаправленный список, удаляет очень быстро из огромного списка // но худше ArrayCopy // Linked нужно использовать для очередей, очень удобно для доступа к раям очереди. Как стэк.

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);

        }
    }
}
