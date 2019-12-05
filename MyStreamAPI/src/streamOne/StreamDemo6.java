package streamOne;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.7);
        myList.add(20.4);
        myList.add(24.3);
        myList.add(10.5);
        myList.add(5.6);
        myList.add(17.9);
        myList.add(2.0);

        System.out.println("Current value: ");
        myList.stream().forEach(a -> System.out.println(a + " "));
        System.out.println();

        IntStream cStr = myList.stream()
                .mapToInt( a -> (int) Math.ceil(a));
        System.out.println("Max accept broads values of myList: " );

        cStr.forEach( a -> {
            System.out.println(a + " ");
        });
    }
}
