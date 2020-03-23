package SecondBlock;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
       // В отличии от всех остальных объектов String хранится в пуле
        String s = "string1";
        String s1 = "string2";
        Object o1 = new Object();
        Object o2 = new Object();
         /*if (o1 == o2){// <- сравнивает обьекты - находятся ли они в одном месте памяти. Две разные сылки но ведули они на один и тот же объект
             System.out.println("==");
         }*/
        if (s == s1){// <-equals используется для сравнения ОН ПРОВЕРЯЕТ ЗНАЧЕНИЕ, А == ПРОВЕРЯЕТ ПАМЯТЬ.
            System.out.println("==");
        }








        /*Integer i = new Integer(3);
        i++;//Автобоксинг
        /* Same as
        int tempVar = i.intValue();
        tempVar ++;
        i = new Integer(tempVar);
        System.out.println(i);

        List<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        for (int k : list){
            System.out.println(k);
        }
*/




        /* Integer р = new Integer(9);
        Integer w = new Integer("33");
        int l = Integer.parseInt("2");//same as new Integer();
        int d = Integer.valueOf("3");//same as new Integer(


         */
        /*  ССЫЛОЧНЫЙ ТИП - ХРАНИТ ССЫЛКУ НА ОБЪЕКТ HIPE В ПАМЯТИ */
        /*  ПРИМИТИВНЫЕ ТИПЫ - ХРАНЯИТ СОБСТВЕННЫЕ ЗНАЧЕНИЕ*/
        /*
        * INT
        * DOUBLE
        * FLOAT
        * SHORT
        * LONG
        * CHAR
        * BYTE
        * BOOLEAN
        /*НАД НИМИ НАД ВСЕМИ ЕСТЬ ОБЕРТКИ
        Byte bt;
        Short sht;
        Integer in;
        Long ln;
        Boolean bl;
        Float fl;
        Character ch;
        Short shrt;

    //В списке не будет работать int нужно использовать INTEGER
        List<Integer> list;
        int j = new Integer(2); // same as int j = 2; can't int j = "2";

        }
    Object method(){
        return 1; // тоже самое(комп приведет 1 к )-> new Integer(1); и в итоге он вернет объект*/
    }
}
