package ThirdBlock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSimple {
    public static void main(String[] args) {
        Set set =new HashSet();//неупорядоченный колекции
        Set set2 =new LinkedHashSet();//упорядоченная колекция
        Set se3 =new TreeSet();//отсортированная колекция по разным алгаритмам(передаем в конструктор Comper)
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("1");
        set.add("2");
        for (Object o : set){
        System.out.println(o);
        }
    }
}
