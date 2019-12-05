package text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat df;
        df =new SimpleDateFormat("hh:mm:ss");

        System.out.println(df.format(date));
        df = new SimpleDateFormat("dd MM yyyy hh:mm:ss zzzz");
        System.out.println(df.format(date));

        df = new SimpleDateFormat("EEEE d MMMM yyyy");
        System.out.println( df.format(date));
    }
}
