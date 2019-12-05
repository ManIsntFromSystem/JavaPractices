package packOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end tablet");

        while (mat.find()) System.out.println("Match: " + mat.group());
    }
}
