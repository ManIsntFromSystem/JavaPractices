package JavaEightEx;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodReferences {
    public static void main(String[] args) {
        System.out.println(A.add(2,3));
        B b = new C();
        b.sayHello();
    }
}

interface B {
    void printMessage(String message);
    default void sayHello(){
        printMessage("Hello");
    }
}

class C implements B, D{
    @Override
    public void printMessage(String message) {
        System.out.println("Hello");
    }

/*    @Override
    public void sayHello() {
        System.out.println("new hello");
    }*/
}

interface D extends B{
    default void sayHello(){
        System.out.println("Hellllo");
    }
}

interface A {
    static int add(int x, int y){
        return x + y;
    }
}
