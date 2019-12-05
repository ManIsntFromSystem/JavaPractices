package rmi;

import java.rmi.Naming;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://" + args[0] + "/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);

            System.out.println("First number: " + args[1]);
            double d1 = Double.valueOf(args[1]).doubleValue();
            System.out.println("Second number: " + args[2]);
            double d2 = Double.parseDouble(args[2]);
            System.out.println("Sum: " + addServerIntf.add(d1, d2));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
