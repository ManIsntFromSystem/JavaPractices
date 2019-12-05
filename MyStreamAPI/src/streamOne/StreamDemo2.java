package streamOne;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo2 {
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

        double productOfSqrRoots = myList.parallelStream().reduce(
                1.0,
                (a,b) -> a * Math.sqrt(b),
                (a,b) -> a * b);
        System.out.println("Sqr : " + productOfSqrRoots);
    }
}