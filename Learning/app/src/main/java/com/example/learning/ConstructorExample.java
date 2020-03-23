package com.example.learning;

class ThirdConstructor{
    ThirdConstructor(){//3
        super();//default//4 -> in Object ->
        System.out.println("Third constructor");//5
    }
    ThirdConstructor(int k){// don't working
        System.out.println("Third constructor");
    }
}

public class ConstructorExample extends ThirdConstructor {
   /* //In any case our classes extends Object
    ConstructorExample(int i){
       // super();
    }
    ConstructorExample(){
        this(4);
    }*/

   ConstructorExample(){//1
       super();//default//2
       System.out.println("First constructor");//6
   }

    public static void main(String[] args) {
        new ConstructorExample();
    }
}
