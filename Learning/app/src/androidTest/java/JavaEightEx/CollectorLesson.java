package JavaEightEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class CollectorLesson {
    public static void main(String[] args) {
        Stream.of("one", "two").collect(Collectors.toCollection(ArrayList::new));
        Stream.of("one", "two").collect(Collectors.toCollection(TreeSet::new));

        Stream.of("one", "two").collect(Collectors.maxBy(Comparator.comparing(x -> x)));
        Stream.of(1, 2).collect(Collectors.averagingInt(x -> x));

        Map<Boolean, List<Integer>> map = Stream.of(1,2,3,4).collect(Collectors.partitioningBy(x -> x > 2));

        Map<Integer, List<Integer>> map2 = Stream.of(1, 2, 2, 4).collect(Collectors.groupingBy(x -> x));

        String result = Stream.of("one", "two", "three").collect(Collectors.joining(",",  "{", "}"));
        Map<Integer, Long> map3 =  Stream.of(1, 2, 3, 3, 4, 3, 4).collect(Collectors.groupingBy(x -> x, counting()));
        System.out.println(map3.get(3));
    }
}
