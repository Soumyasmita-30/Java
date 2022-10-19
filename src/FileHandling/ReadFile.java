package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HP\\IdeaProjects\\training\\File\\Java\\Demo.text");
        Scanner read = null;
        try {
            read = new Scanner(obj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(read.hasNext()){
            String data = read.nextLine() ;
            System.out.println(data);
        }
        read.close();
    }
}
