package JavaEightEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Arrays.parallelPrefix;

public class StreamLessons {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        //Stream.of("one", "two"). //the same list.stream and get a stream out list with value ("one", "two")
        Stream.of(asList("one", "two"), asList("three", "four")).flatMap(x -> x.stream());//array of  // flatMap() - превращает все значения в последовательсности(as simple Map)

        int value = Stream.of(1, 2).min(Comparator.comparing(x -> x)).get();//return one value - optional(object is which to get across get();)
        int value2 = Stream.of(1, 2).max(Comparator.comparing(x -> x)).get();

        int count = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);//the same -> 6
        int accomulator = 0;
        for (int element : new int[]{1, 2, 3}) {
            accomulator += element;//in total is 6
        }

        Stream.of("one", "two").sorted().collect(Collectors.toList());
        Stream.of("one", "two").sorted().limit(1).distinct().collect(Collectors.toList());//we can that
        Stream.of("one", "two").limit(11).collect(Collectors.toList());
        Stream.of("one", "two").distinct().collect(Collectors.toList());
        Stream.of("one", "two").skip(11).collect(Collectors.toList());
        Stream.of("one", "two").filter(x -> x.equals("one")).findAny().get();
        Stream.of("one", "two").filter(x -> x.equals("one")).findAny().isPresent();
        Stream.of(1, 2).mapToInt(x -> x).sum();
        Stream.of(1, 2).count();
        Stream.of("one", "two").peek(x -> x.toUpperCase()).findFirst().get();

        IntStream intStream = Stream.of(2, 2).mapToInt(x -> x);
        intStream.summaryStatistics().getAverage();

        /*Set<String> set = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());

        for (String s : list){
            System.out.println(s);
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Stream<String> stringStream = list.stream();//перевоплощает поток всех значений которые у нас есть в поток значений
        //кадый раз нужно получать новый stream

        stringStream.forEach(x -> System.out.println(x));

        list.stream().forEach(x -> System.out.println(x));//сокращенный вариант

        list.stream().filter(x -> x.equals("one"));//filter
        list.stream().filter(x -> {
            //System.out.println("hello");
            System.out.println(x);
            return x.equals("one");
        }).count();//lazy/eager
*/


    }
}
