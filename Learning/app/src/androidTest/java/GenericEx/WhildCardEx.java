package GenericEx;

public class WhildCardEx {
    static void add(CellO cell){
        cell.setT("hello");
    }
    public static void main(String[] args) throws Exception{//нельзя совмещать generic код и обычный код
        CellO<House> cellO = new CellO<>();
        add(cellO);
        House house = cellO.getT();
    }
}
class House{}

class CellO <T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
