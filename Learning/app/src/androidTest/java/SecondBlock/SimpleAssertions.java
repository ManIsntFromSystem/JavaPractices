package SecondBlock;

import MyExceptions.SimpleExceptions;

public class SimpleAssertions {
    public static void main(String[] args) {
        new SimpleExceptions();
    }

    private void someMethod(int a){ //делается для проверки аргументов в switch
        assert (a > 0); //выбросится ошибка
        //нужно убирать при релизе
        // do something with a
    }
}
