package MultiThreadTwo;

public class DeadlockExample {
    //DeadLock - это проблема когда два потока(или больше) пытаются вызвать методы друг у друга в одно и тоже время
    //нужно строить свои приложения, чтобы такого не было

    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyThreaadOne myThreaadOne = new MyThreaadOne();
        MyThreaadTwo myThreaadTwo = new MyThreaadTwo();
        myThreaadOne.resourceA = resourceA;
        myThreaadTwo.resourceB = resourceB;
        myThreaadOne.start();
        myThreaadTwo.start();
    }
}

class MyThreaadOne extends Thread{
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}

class MyThreaadTwo extends Thread{
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}


class ResourceA {
    ResourceB resourceB;
    public synchronized int getI(){
        //поток зашел сюда и теперь класс залоченый и никакой другой с ним не может работать
        return resourceB.returnI();
    }
    public synchronized int returnI(){
        return 1;
    }
}

class ResourceB {
    ResourceA resourceA;
    public synchronized int getI(){
        //мы не сможем это выполнить так как ресурс А залочен
        //в итоге все по кругу и прорамма виснет
        return resourceA.returnI();
    }
    public synchronized int returnI(){
        return 2;
    }
}
