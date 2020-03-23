package ThirdBlock;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericsSimple <T extends  Comparable & Serializable>{//используйется в колекциях, нельзя создать масивы и статические методы.

    T var;

    /*public static void main(String[] args) throws Exception {//Generic работает только при компиляции - потом все T становятся Object
        List<Child>

        }

        void method1(List<Parent> list) {
            list.add(new GenericsSimple<>());
    }
    class Parent{

    }

    class Child extends Parent{

    }
    /* List<String> list = new ArrayList<>();
        List<File> list3 = new ArrayList<>();
        List list1 = new ArrayList();
        list.add("String");
        list1.add("");
        list1.add(new GenericsSimple<>());
        list1.add(new File("2"));
        for (Object o : list1) {
            System.out.println(o);*/

        //Все колекции содержать generics по умолчанию
        //GenericsSimple genericsSimple = new GenericsSimple();
        //genericsSimple.<String>method("22");
       // genericsSimple.method2(new GenericsSimple());
        //GenericsSimple<Car> genericsSimple11 = new GenericsSimple<>();
        //genericsSimple11.var = new Car();
        //genericsSimple.method("");
        //genericsSimple.var="sq";
        //System.out.println(genericsSimple11.var);
   // }

    /*<T>  void method (String s) {//
        //Можно любой тип
        System.out.println(s);

    }
    T method3 (T type) {//
        //Можно любой тип
        type.compareTo(new Object());
        System.out.println(type);
        return type;
    }
    <T> T method2 (T type){//обобщенный метод. Можем заранее не знать с каким типом он будет работать.
        //Можно любой тип
        return type;
    }

    private class Car implements Comparable, Serializable{

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }*/
}
