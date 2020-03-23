package SecondBlock;

public class OverloadingExampl {
    public static void main(String[] args) {
        OverloadingExampl o1 = new OverloadingExampl();
        short b = 5;
        o1.method11(b); //
    }

   /* void method11(int i){ //Veidening расширение пойдет к int
        System.out.println("int");
    }*/

  /*  void method11(long i){
        System.out.println("long");
    }*/

    void method11(Integer i){
        System.out.println("integer");
    }

    /*void method11(double i){
        System.out.println("double");
    }*/

    /*void method11(byte i){
        System.out.println("byte");
    }
*/
    void method11(Byte... i){
        System.out.println("Byte");
    }

    void method11(Object... i){
        System.out.println("Object...");
    }

    void method11(Object i){
        System.out.println("Object");
    }

   /* void method11(short... i){
        System.out.println("short...");
    }*/

    void method11(Short i){
        System.out.println("Short");
    }

}
