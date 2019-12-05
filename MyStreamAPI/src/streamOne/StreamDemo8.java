package streamOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gama");
        myList.add("Delta");
        myList.add("Ksi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();

        Iterator<String> itr = myStream.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        myStream = myList.stream();

        Spliterator<String> split = myStream.spliterator();

        while (split.tryAdvance(System.out::println));

        split.forEachRemaining(System.out::println);

        myStream = myList.stream();

        Spliterator<String> spliterator2 = myStream.spliterator();

        Spliterator<String> spliterator22 = spliterator2.trySplit();

        if(spliterator22 != null){
            System.out.println("Result returned Spliter22: ");
            spliterator22.forEachRemaining( System.out::println);
        }
        System.out.println("\n Result returned Spliter2: ");
        spliterator2.forEachRemaining(System.out::println);
    }
}
