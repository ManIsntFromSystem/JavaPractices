package GenericEx;

import java.io.Serializable;

public class GenericBoundsEx {
    public static void main(String[] args) {
        Cell<Job> cell = new Cell<>();
        Cell cell2 = new Cell<>();//<Job> - не обязательно он должен быть
        cell.setT(new Job());
        cell.doJob();

        Cell<ChildJob> cell3 = new Cell<>();
        cell3.setT(new ChildJob());
        cell3.setT(new ChildJob());//или так
        cell3.doJob();
    }
}

class Job  implements Serializable{
    void doit(){
        System.out.println("do it");
    }
}

class ChildJob extends Job {}

class Cell<T extends Job & Serializable>{//расширяем функционал Generic  с помощью extend
                            //& - чтобы добавить к наследованию - имплементацию интерфейса
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void doJob(){
        t.doit();
    }
}
