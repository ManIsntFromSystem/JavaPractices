package MultiThreading;

public class MultiThreadTwo {
    public static void main(String[] args) throws Exception {
        Resource.i = 5;

        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.setName("one");
        MyThreadTwo myThreadTwo2 = new MyThreadTwo();
        myThreadTwo.start();
        myThreadTwo2.start();
        myThreadTwo.join();
        myThreadTwo2.join();
        System.out.println(Resource.i);
    }
}

class MyThreadTwo extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        Resource.changeStaticI();
        new Resource().changeI();
    }
}

class Resource {
    static int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {//все поля которые еняют значения должны быть синхронизированными(лочат обьект)
        //пока один поток не дойдет до конца, другой не будет выполнятся
        this.i = i;
    }

    public synchronized static void changeStaticI() {//синхронизирует на уровне класа
        synchronized (Resource.class) {
            int i = Resource.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }

    public void changeI() {//этот и поток выше буду выполнятся одновременно, так как разные уровни(локи разные)
        //НИКОГДА НЕ СНХРОНИЗИРОВАТЬ ОБА ВАРИАНТА ВМЕСТЕ
        //на уровне обьекта - обьектные переменные
        //в статике - статический
        synchronized (this) {
            int i = Resource.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }
}

       /* Resource resource = new Resource();
        resource.setI(5);

        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.setName("one");
        myThreadTwo.setResource(resource);
        MyThreadTwo myThreadTwo2 = new MyThreadTwo();
        myThreadTwo2.setResource(resource);
        myThreadTwo.start();
        myThreadTwo2.start();
        myThreadTwo.join();
        myThreadTwo2.join();
        System.out.println(resource.getI());
    }
}
class MyThreadTwo extends Thread{
    Resource resource;

    public void setResource(Resource resource){
        this.resource = resource;
    }
@Override
    public void run(){
        resource.changeI();
    }
}

class Resource{
    private int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {//все поля которые еняют значения должны быть синхронизированными(лочат обьект)
        //пока один поток не дойдет до конца, другой не будет выполнятся
        this.i = i;
    }

    public synchronized void changeI(){
        int i = this.i;
        if(Thread.currentThread().getName().equals("one")){
            Thread.yield();
        }
        i++;
        this.i = i;
   }
*/
