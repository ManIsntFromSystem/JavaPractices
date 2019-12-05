package packOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();

        System.out.println("Match check at Java: ");
        if(found) System.out.println("It's match");
        else System.out.println("Don't match");

        System.out.println();
        System.out.println("All match check 2: ");
        mat = pat.matcher("Java 9");
        found = mat.matches();

        if(found) System.out.println("It's match");
        else System.out.println("Don't match");

        System.out.println();
        System.out.println("Partial match check: ");

        if(mat.find()) System.out.println("There is match");
        else System.out.println("There isn't match");

        System.out.println();
        pat = Pattern.compile("test");
        mat = pat.matcher("test 1 2 3 4 test");
        System.out.println("Partial match check 2: ");

        while (mat.find())System.out.println("Sequence - <test> found on index: " + mat.start());

    }
}
