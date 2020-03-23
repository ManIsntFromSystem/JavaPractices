package ThirdBlock;

import android.support.annotation.Nullable;

import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book {
    String author;
    String name;
}

class Ticket {
    int number;
    String libraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number &&
                Objects.equals(libraryName, ticket.libraryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, libraryName);
    }
}

public class CollectionsSimple extends Object {
    int value;
    public static void main(String[] args) {
        //CollectionsSimple collectionsSimple = new CollectionsSimple();
        Ticket ticket = new Ticket();
        ticket.number = 2562;
        Book book = new Book();
        book.author = "Karnagi";
        book.name = "How to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        //Map<String, Book> library = new HashMap<>();
        library.put(ticket, book);// ключ, обьект

        Ticket ticket2 = new Ticket();// новый билет не найдет, так как он находится в другом месте памяти NullPointer
        ticket2.number = 2562;//что бы не от памяти отталкивалось нужно переопределить tquals and hashCode в тикете

        Book karnagiBook = library.get(ticket2);
        System.out.println(karnagiBook.author);
       // System.out.println(book.hashCode());
        //System.out.println(new Book().hashCode());

        /*
        *
        *    __  __  __  __
        *     1   2 ...   232
        * */


        /*
        * HashCode() - возвращает адрес в памяти если мы его не переопределили
        * and
        * equals() - сравнивает адреса в памяти (эквиваленты или нет) если в одном и том же месте памяти то обьекты не эквивалентны
        * нужно переопределять при работе с колекциями c Map c HashCode.........
        *
        *
        * */
    }

}
