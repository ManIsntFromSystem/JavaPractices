package GenericEx;

public class GenericExMat {
    public static void main(String[] args) {
        Cell<String> cell = new Cell<>(new GenericExMat());
        System.out.println(cell.getE(new Integer(5)));
        System.out.println(cell.<Integer>getE(new Integer(5)));//когда так вызываем, то уже string сюда не впихнуть // необязательно

    }

    static class Cell<T> {
        T t;
        //generic методы могут быть как в обычных класах так и в generic
        //параметры generic методов не должны быть такие как и у класа
        <X> Cell(X x) {//можно создавать конструкторы

        }

        public void setT(T t) {
            this.t = t;
        }

        <E> E getE(E e){//можно создавать другие generic методы внутри класа generica
            return e;
        }
    }
  /*  <T> void method(T t){//создаем generic метод в не generic класе

    }*/
}
