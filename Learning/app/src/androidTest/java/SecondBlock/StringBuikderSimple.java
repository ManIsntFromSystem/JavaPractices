package SecondBlock;

public class StringBuikderSimple {

    public static void main(String[] args) {
       /* String s = "abc";
        String d = s.concat("def");
        System.out.println(s);
        System.out.println(d);*/

        StringBuilder stringBuilder = new StringBuilder("asdd");//
        stringBuilder.append("aaaaaa");
        stringBuilder.insert(0, "-");
        System.out.println(stringBuilder);
        //StringBuffer stringBuffer;
    }
}
