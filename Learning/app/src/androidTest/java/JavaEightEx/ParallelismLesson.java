package JavaEightEx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class ParallelismLesson {//стримы выполняется сразу на нескольких ядрах
    public static void main(String[] args) {
       List<Integer> integers = new ArrayList<>();
       for (int i = 0; i < 10_000_000; i++){
           integers.add(i);
           integers.add(10_000_000 - i);
       }
        System.out.println(new Date());
        integers.stream().sorted().filter(x -> x%2 == 0).map(x -> new Double(x)).forEach(x -> x.toString());
       //integers.parallelStream().sorted().count();
        System.out.println(new Date());


        /* Stream stream = Stream.of(1, 3).parallel();//ускоряет выполнение стримов
        List list = new ArrayList();
        list.parallelStream();//the same above  */

    }
}
