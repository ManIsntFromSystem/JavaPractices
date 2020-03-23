package com.example.learning;

class Parent{
    Parent method() throws Exception{
    return new Parent();
    }
    /*protected int method(){//модификаторы доступа могут быть разные. Мы можем только расширять default - > protected -> public
    //так же и с Exception
        //static перегружать нельзя
        //параметры и методы одинаковые
        // synchronized
        return 1;
    }*/
}

class Child extends Parent {
    @Override
    Child method() throws RuntimeException{
        return  new Child();
}
   /* @Override
    public int method(){
        //strictfp final
        return 3;*/
    }
// Полиморфизм, диномическое связывание
public class OverrideExample {
    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());
    }
}

