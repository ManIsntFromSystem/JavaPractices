package SecondBlock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWorksSimple {
    public static void main(String[] args) throws Exception {
        File file = new File("temp1.txt");
        if (!file.exists()) {
            //file.mkdir();
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
       // fileWriter.flush();
        //fileWriter.close();

        FileReader fileReader = new FileReader(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str4");
        bufferedWriter.newLine();
        bufferedWriter.write("str5");
        bufferedWriter.flush();
        bufferedWriter.close();


        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }


        /*FileReader fileReader = new FileReader(file);
        char[] chars = new char[20];
        fileReader.read(chars);
        System.out.println(chars);*/







         /*   System.out.println("exists");
        }
        if(file.isDirectory()){
            System.out.println("dir");
        }if(file.isFile()){
            System.out.println("file");
        }
    }*/

    }
}

