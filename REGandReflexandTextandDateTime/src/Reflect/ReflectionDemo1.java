package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo1 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Constructors: ");
            Constructor constructors[] = c.getConstructors();
            for(Constructor con : constructors){
                System.out.println(" " + con);
            }

            System.out.println("Fields: ");
            Field fields[] = c.getFields();
            for(Field f : fields){
                System.out.println(" " + f);
            }

            System.out.println("Methods: ");
            Method methods[] = c.getMethods();
            for(Method met : methods){
                System.out.println(" " + met);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
