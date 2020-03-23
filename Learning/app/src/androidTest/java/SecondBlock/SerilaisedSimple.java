package SecondBlock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilaisedSimple {
    public static void main(String[] args) throws Exception{
        UserChild user1 = new UserChild();
        user1.LifeLevel = 55;
        user1.ser = 35;
        Sord sord = new Sord();
        sord.level = 3;
        user1.sord = sord;
        user1.childLevel = 44;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(user1);
        outputStream.close();

        user1.ser = 25;

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.LifeLevel);
        System.out.println(newUser.ser);
        System.out.println(newUser.sord);
        System.out.println(newUser.childLevel);
    }

}
