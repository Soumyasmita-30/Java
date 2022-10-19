package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFileAgain {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HP\\Desktop\\NEW\\SOUMYA\\seema.txt");
        Scanner read = null;
        try {
            read = new Scanner(obj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(read.hasNextLine()){
            String data = read.nextLine();
            System.out.println(data);
        }
    }
}
