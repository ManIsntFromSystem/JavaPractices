package streamOne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NamePhoneEmail2 {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail2(String n, String р, String е) {
        name = n;
        phonenum = р;
        email = е;
    }
}

class NamePhone1 {
    String name;
    String phonenum;

    NamePhone1(String n, String р) {
        name = n;
        phonenum = р;
    }
}

class StreamDemo7 {
    public static void main(String[] args) {
        //  Список имен, номеров телефонов
        //  адресов электронной почты
        ArrayList<NamePhoneEmail2> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail2("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail2("Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail2("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone1> nameAndPhone = myList.stream().map( a -> new NamePhone1(a.name, a.phonenum));

        List<NamePhone1> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Name and address from list of myList: ");

        for (NamePhone1 nanp : npList) {
            System.out.println(nanp.name + ": " + nanp.phonenum);
        }

        nameAndPhone = myList.stream().map(a -> new NamePhone1(a.name, a.phonenum));

        Set<NamePhone1> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("Список имен номеров телефонов " +
                " в множестве типа Set: ");

        for (NamePhone1 e : npSet){
            System.out.println(e.name + ": " + e.phonenum);
        }

        nameAndPhone = myList.stream().map(a -> new NamePhone1(a.name, a.phonenum));

        LinkedList<NamePhone1> npLinked = nameAndPhone.collect(
                LinkedList::new,
                LinkedList::add,
                LinkedList::addAll
        );

        System.out.println("Список имен номеров телефонов " +
                " в множестве типа npLinked: ");

        for (NamePhone1 e : npLinked){
            System.out.println(e.name + ": " + e.phonenum);
        }
    }
}
