package ThirdBlock;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSimple {
    public static void main(String[] args) {
        Queue queue = new LinkedList();//упорядоченная очередь, в том порядке в котором они были добавленны
        Queue queue2 = new PriorityQueue();//отсортированная очередь, отсортирует их(в масив добавляет и отсортировует при добавлении)
        queue.add("1");
        queue.add("2");
        queue.add("455");
        queue.add("3");
        List list = (List) queue;//+ отсортировали 1 раз, - нужно писать этот код. Но Priority лучше, он сам все делать
        Collections.sort(list);
        while (queue.size() > 0){
            System.out.println(queue.poll());
        }
    }
}
