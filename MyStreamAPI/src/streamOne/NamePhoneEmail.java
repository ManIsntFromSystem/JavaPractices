package streamOne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String n, String р, String е) {
        name = n;
        phonenum = р;
        email = е;
    }
}

    class NamePhone {
        String name;
        String phonenum;

        NamePhone(String n, String р) {
            name = n;
            phonenum = р;
        }
    }

class StreamDemo5 {
    public static void main(String[] args) {
        //  Список имен, номеров телефонов
        //  адресов электронной почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@HerbSchildt.com"));

        System.out.println("Иcxoдныe элементы из списка myList: ");

        myList.stream().forEach((а) -> {
            System.out.println(а.name + " " + а.phonenum + " " + а.email);
        });
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream()
                .filter( a -> a.name.equals("Джeймc"))
                .map( (а) -> new NamePhone(а.name, а.phonenum));

        System.out.println("Список имен номеров телефонов: ");

        nameAndPhone.forEach((а) -> {
            System.out.println(а.name + " " + а.phonenum);
        });
    }
}