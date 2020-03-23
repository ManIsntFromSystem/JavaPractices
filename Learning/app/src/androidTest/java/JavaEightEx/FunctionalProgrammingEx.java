package JavaEightEx;

import android.os.Message;
import android.support.test.espresso.core.internal.deps.guava.base.Function;

public class FunctionalProgrammingEx {
    public static void main(String[] args) {

    }

    public int square(int x){//два параметра // в любом случае у обьекта по умолчанию есть 1 параметр - ЕГО СОСТОЯНИЕ
        return x * x;
    }

    Function<Integer, Integer> add1 = x -> x * x ;

    void process(Message message){

    }
    public void processNext(){
        String str1 = "ddd";
        String val1 = str1;

        if (val1.equals(str1)){
            System.out.println(val1);
        }
    }
}
