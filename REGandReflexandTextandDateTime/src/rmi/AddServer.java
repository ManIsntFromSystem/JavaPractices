package rmi;

import java.rmi.Naming;

public class AddServer {
    public static void main(String[] args) {
        try {
            AddServerImpl addServer = new AddServerImpl();
            Naming.rebind("AddServer", addServer);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
