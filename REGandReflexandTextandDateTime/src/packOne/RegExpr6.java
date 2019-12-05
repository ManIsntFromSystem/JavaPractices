package packOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr6 {
    public static void main(String[] args) {

        Pattern pat = Pattern.compile("[ ,.!]");

        String[] strs = pat.split("one two, alpha2 12!done,22.");

        for (String str : strs) {
            System.out.println("Next token: " + str);
        }
    }
}
