package FouthBlock;

import org.junit.runners.Parameterized;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionSimple {
    public static void main(String[] args) throws Exception{//позволят получить полный доступ к классу - все прочитать, что бы увидеть содержимое . для библеотек.
        Someclass someclass = new Someclass();
        Class clss = someclass.getClass();

        System.out.println(clss.getName());

        System.out.println("");
        System.out.println("Constructors: ");

        /*Class clss2 = Someclass.class;
        Class clss3 = Class.forName("com.example.learning.MyParent");
        Someclass someclass1 = (Someclass) clss.newInstance();//the same that new SomeClass //  Получаем экземпляр класа с помощью реФлексии*/

       // Constructor[] constructors = clss.getMethods();// все методы класа
        Constructor[] constructors3 = clss.getDeclaredConstructors();// все методы класа
        for (Constructor constructor : constructors3){
            System.out.println(constructor.getName());
            //при компиляции все аргументы в конструкторах превращаются в arg0, arg1 ,,,,

            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }
        //Constructor[] constructors1 = clss.getDeclaredMethods();// все обьявленные(задекларированные) методы класа

        System.out.println("");
        System.out.println("Methods: ");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }

            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getName());
            method.invoke(someclass, "test");
        }

        System.out.println("");
        System.out.println("Fields");// Field - это параметры i, s
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            field.setAccessible(true); //По умолчанию false  поэтому нельзя, но если true то тогда уже изменения пройдут
            System.out.println(field.getInt(someclass));// не получится так получить доступ к приватным полям
            field.setInt(someclass, 3);
            System.out.println(field.getInt(someclass));
        }
    }
}
class Someclass {
    private  int i;
    //String s;

    public Someclass() {
    }

    Someclass(String s){
        //this.s = s;
    }
    public synchronized String someMethod(String s){
        System.out.println("this is: " + s);
        return s;
    }
}