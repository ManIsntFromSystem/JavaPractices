package Multitreading;

import java.util.concurrent.Semaphore;

public class MySemophore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person.table = semaphore;
        person1.table = semaphore;
        person2.table = semaphore;
        person3.table = semaphore;
        person4.table = semaphore;

        person.start();
        person1.start();
        person2.start();
        person3.start();
        person4.start();
    }
}

class Person extends Thread{
    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() +  "Waiting...");
        try {
            table.acquire();
            System.out.println(this.getName() + "eat at the table. ");
            Thread.sleep(1000);
            System.out.println(this.getName() + "release the table. ");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}