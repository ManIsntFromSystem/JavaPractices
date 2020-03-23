package JavaEightEx;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceLessonEx {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;//функциональный интерфейс, как будто мы написали реализацию этого итерфейса
        Consumer<Integer> consumer = x -> System.out.println(x);//входной integer  выходной булиан
        Function<Integer, String> function = x -> x.toString();//входной intager, выходной - string
        Supplier<Integer> supplier = () -> new Integer(3);//принимает 0 параметров на вход, на выход возвращает eneric type - Integer
        UnaryOperator<Integer> unaryOperator = x -> x * x;//принимает - int, на выход - int.
        System.out.println(predicate.test(3));
        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;//the same Unary

        MyPredicate<Integer> myPredicate = x -> System.out.println(x);
        myPredicate.apply(5);
    }
}

interface MyPredicate <T>{
    void apply(T t);
}
/*
Predicate<Integer> predicate = x -> x > 5;
Consumer<Integer> consumer = x -> System.out.println(x);
Function<Integer, String> function = x -> x.toString();
Supplier<Integer> supplier = () -> new Integer(5);
UnaryOperator<Integer> unaryOperator = x -> x * x;
BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;*/


