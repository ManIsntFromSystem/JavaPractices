package GenericEx;

import java.util.ArrayList;
import java.util.List;

public class ObobshennyiAndNotObGen {
    public static void main(String[] args) {
        CellT<Car> cellT= new CellT<Car>();
        CellT<?> cellT1= new CellT<Volkswagen>();//WildCart // типа джокера в картах // может являтся абсолютно любым обьектом // но делать ничего нельзя
        //WildCart используются что бы были полиморфные Generic
        //ноесть решение

        CellT<? super Volkswagen> cellT2 = new CellT<Car>();// after new - wont be Child(Passat) classes - only Parent(Car, Object)
        cellT2.setT(new Passat());
        cellT2.setT(new Volkswagen());//well be able to set objects and Childs in here
        Volkswagen volkswagen = (Volkswagen) cellT2.getT();//а вот так можно делать get но так делать не хорошо

        CellT<? extends Volkswagen> cellT3 = new CellT<Passat>();//вот так делать стоит, сюда можно впихнуть все обьекты которые являются Child а Parent нельзя
        Volkswagen volkswagen1 = cellT3.getT();//get we can do
        //cellT3.setT();//get we can't do

        List<Volkswagen> arr = new ArrayList<>();
       List<? extends Volkswagen> list = (List<? extends Volkswagen>) arr;
        for (Volkswagen v : list) {
            System.out.println(volkswagen.toString() + "");
        }

        // extend - мы можем только get
        //super - мф можем только set
    }
}

class Car{}
class Volkswagen extends Car{}
class Passat extends Volkswagen{}

class CellT<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        //this.t = t;
    }
}
