package MyExceptions;

import java.io.IOException;

public class SimpleExceptions {
    public static void main(String[] args) throws Exception{

            new SimpleExceptions().method();
    }
    void method() throws IOException, RuntimeException, Exception{//checked Exception- отлавливаются    && unchecked Exception не отлавлтваются
        //throw new RuntimeException();
            throw new IOException();

        /*
        * Throwable -> checked
        *Error() -unchecked and Exceptions -> checked
        *RuntimeExceptions - unchecked
        * IOExceptions - checked
        * */
   /* void method(){
        try {
            System.out.println("try");
        } catch (ArrayIndexOutOfBoundsException e){ //начинпьт с ирархии от малого до общего
            try {
                throw new RuntimeException();
            } catch (ArrayIndexOutOfBoundsException err) {

            } catch (RuntimeException er) {
            }
        }finally {
        }
*/


        /******
         * public static void main(String[] args) {
         *         new SimpleExceptions().method();
         *         System.out.println("after method");
         *     }
         *
         *     void method(){
         *         try {
         *             System.out.println("try");
         *             Object o = null;
         *             //System.exit(0);
         *         } finally {// yt ds
         *             System.out.println("before exit");
         *             //System.exit(0);
         *                 throw new RuntimeException();
         *         }
         *


        /*******
         * Second
         public static void main(String[] args) {
         System.out.println(new SimpleExceptions().method());
         }
        try {
            System.out.println("try");
            Object o = null;
            // o.hashCode();
            //throw new Exception();
            return "try2";
        }
        catch (NullPointerException e){//отлавливает Exceptions они могут быть разные
            System.out.println("catch");
            return "catch2";
//            e.printStackTrace();
        }finally {//close  - connection it's only one   ////  необязательный    /////    можно запретить выполение Syste.exit(0); и бесконечный цикл
            System.out.println("finally");
            return "finally2";



       /* try {
            Object o = null;
            o.hashCode();
            //throw new Exception();
            System.out.println("try");
        }
        catch (NullPointerException e){//отлавливает Exceptions они могут быть разные
            System.out.println("catch");
//            e.printStackTrace();
        }finally {//close  - connection it's only one
            System.out.println("finally");
        }*/
    }
}
