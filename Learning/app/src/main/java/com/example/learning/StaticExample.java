package com.example.learning;

public class StaticExample {
    static int i = 2; //поле будет одно// инициализация значений и после запускается статический инициалайзер сначала эти поля
    //int j;
    static { ///статические поля инициализации
        //int i = 6;
        System.out.println("Static initialiser");
    }
    {//обычный инициалайзер
        System.out.println("initialiser");
    }
    StaticExample(){//а после мы зайдем в конструктор
        i++;
        System.out.println("Constructor");
    }
    //Эта последовательность выполняется с каждым new
    static void staticMethod(){
        //int i =7;
        System.out.println("Static method");
    }

    public static void main(String[] args) {
       new StaticExample();
        new StaticExample();
        new StaticExample();
        new StaticExample();
        new StaticExample();
        System.out.println(StaticExample.i);
      /*  StaticExample staticExample = new StaticExample();
        StaticExample staticExample2 = new StaticExample();

        staticExample.j = 2;
        staticExample2.j = 212;
        System.out.println(staticExample.j);
        System.out.println(staticExample2.j);

        staticExample.i = 22211;
        staticExample2.i = 211112;
        System.out.println(staticExample.i);
        System.out.println(staticExample2.i);

        System.out.println(StaticExample.i);
        StaticExample.staticMethod();
        System.out.println(StaticExample.i);*/
    }
}
