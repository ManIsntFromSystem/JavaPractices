package MultiThreadThree;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadLocalRandomAndTimeUnitEx{
    public static void main(String[] args) throws Exception{
        System.out.println(Math.random());// в многопоточности так делать нельзя
        System.out.println(ThreadLocalRandom.current().nextInt());//для многопоточности

        //Thread.sleep(2_222);
        System.out.println(TimeUnit.DAYS.toMillis(12));
        System.out.println(TimeUnit.DAYS.toSeconds(12));
    }
}
