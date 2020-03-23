package ThirdBlock;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class ComparePerson implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
public class CollectionsSort {

    public static void main(String[] args) {
        Integer i;// уже имплиментирует интерфейс Comparable
        //у примитивов уже есть сортировка
        //если храним данные типа Person и нам нужно отсортировать по разным параметрам
        //нам нужно umplemets Comparable and @Override
        //если нет доступа к класу Person(тоесть не можем переопределить интерфейс Comparable)
        //в таких ситуациях помогает class implements Comparator<Person>
        //есть compare(); его нужно переопределить

        //ComparePerson comparePerson = new ComparePerson();

        Set set = new TreeSet(new ComparePerson());
        set.add(new Person(2));
        set.add(new Person(5));
        set.add(new Person(55));
        set.add(new Person(44));
        set.add(new Person(23));
        /*set.add("1");
        set.add("3");
        set.add("5");
        set.add("2");*/
        for (Object o : set){
            System.out.println(o);
        }
    }
}
