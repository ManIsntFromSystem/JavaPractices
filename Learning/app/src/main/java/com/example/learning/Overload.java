package com.example.learning;

import java.io.IOException;

public class Overload {
    protected final int testOverloading(int a, int b) throws IOException {
        return a + b;
    }
    public static String testOverloading(String a, String b) throws RuntimeException{
        return a + ", " + b + ".";
    }
    int testOverloading(int a, int b, int g) throws Exception {
        return a + b + g;
    }
    public static void main(String[] args) throws Exception {
        Overload test = new Overload();
        TwoTestOverloading test2 = new TwoTestOverloading();
        System.out.println(test.testOverloading("Dima", "Omelchenko"));
        System.out.println(test.testOverloading(5, 5));
        System.out.println(test.testOverloading(5, 4, 6));
        test2.testOverloading(2);

    }
}
class TwoTestOverloading extends Overload{
    void testOverloading(int i){
        System.out.println("two verload");
    }
}

