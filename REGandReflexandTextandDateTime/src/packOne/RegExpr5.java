package packOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr5 {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";

        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);
        System.out.println("Current sequence: " + str);
        str = mat.replaceAll("Eric ");
        System.out.println("Replaced sequence: " + str);    }
}
