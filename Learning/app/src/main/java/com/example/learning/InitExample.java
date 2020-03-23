package com.example.learning;

class MyParent{
    static {//запускаются при первом обращении к класу
        System.out.println("static init block111");
    }
    MyParent(){
        super();
        System.out.println("parent constructor");
    }
}
public class InitExample extends MyParent{

    static {//запускаются статические блоки при первом обращении к класу
        System.out.println("static init block");
    }

    static {//запускаются при первом обращении к класу
        System.out.println("static init block2");
    }

    InitExample(){
        super();
        {//запускаются после запуска super(); в конструкторе
            System.out.println("init block");
        }
        {//запускаются после запуска super(); в конструкторе
            System.out.println("init block2");
        }
        {//запускаются после запуска super(); в конструкторе
            System.out.println("init block3");
        }
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new InitExample();
    }

}
