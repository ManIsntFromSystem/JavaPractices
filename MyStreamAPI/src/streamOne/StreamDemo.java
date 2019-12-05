package streamOne;

import java.util.stream.*;
import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(20);
        myList.add(24);
        myList.add(10);
        myList.add(5);
        myList.add(17);
        myList.add(2);

        System.out.println("Source list: " + myList);
        //get stream array's list
        Stream<Integer> myStream = myList.stream();
        //get min(), max(), isPresent(), get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        //if (minVal.isPresent()) System.out.println("Min value: " + minVal.get());

        minVal.ifPresent(integer -> System.out.println("Min value: " + integer));
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (minVal.isPresent()) System.out.println("Max value: " + maxVal);

        myStream = myList.stream();
        Optional<Integer> reduceVal = myStream.reduce((n, m) -> n * m);
        reduceVal.ifPresent(integer -> System.out.println("Reduce value: " + integer));

        int eventProduct = myList.stream().reduce(1, (a, b) -> {
            if (b%2 == 0) return a*b;
            else return a;
        });
        reduceVal.ifPresent((integer -> System.out.println("Reduce value 2: " + integer)));



        //sorted list's stream
        Stream<Integer> sortedStream = myList.stream().sorted();
        //show sorted list
        System.out.println("Sorted data's list: ");
        sortedStream.forEach((n) -> System.out.println(n + " "));
        System.out.println();

        //input odd numbers values, call filter()
        Stream<Integer> oddVals = myList.stream().sorted()
                .filter(n -> (n % 2) == 1);
        System.out.println("Odd values: ");
        oddVals.forEach(n -> System.out.println(n + ""));
        System.out.println();

        oddVals = myList.stream().sorted()
                .filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        System.out.println("Odd values which bigger 5: ");
        oddVals.forEach(n -> System.out.println(n + "" ));
        System.out.println();

    }
}
