package packOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr3 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW R WWW R");

        while (mat.find()) System.out.println("Match: " + mat.group());
    }
}
