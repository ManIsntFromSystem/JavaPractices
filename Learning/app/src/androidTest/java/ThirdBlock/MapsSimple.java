package ThirdBlock;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsSimple {
    public static void main(String[] args) {
        Map map = new HashMap();//это неупорядочення колекция которая хранит данные по ключу
        Map map2 = new Hashtable(); //the same HashMap - но они синхронизированные - используется при многопоточности
        Map map3 = new LinkedHashMap();//такая же как HashMap, но упорядочення колекция. (head and tail) (after and before) добавляет в конец или в начало по порядку и хранить ссылки на ранее добавленный-> упорядоч
        Map map4 = new TreeMap();// это отсортированный Map (список)(A black-red tree(алгаритм сортировки))
        map.put("1", "One");
        map.put("3", "Two");
        map.put("2", "Three");
        System.out.println(map.get("2"));
    }
}
