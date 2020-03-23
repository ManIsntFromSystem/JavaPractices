package ThirdBlock;

import java.util.Calendar;
import java.util.Date;

public class DateTimeSimple {
    public static void main(String[] args) throws Exception{
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar);
        System.out.println(calendar.getTime());
    }
}
