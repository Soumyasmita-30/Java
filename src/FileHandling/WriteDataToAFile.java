package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToAFile {
    public static void main(String[] args) throws IOException {
      //  File object = new File() ;
        FileWriter write = new FileWriter("C:\\Users\\HP\\IdeaProjects\\training\\File\\Java\\Demo.text");
        write.append("\nHi everyone\n");
        write.append("Hello");
        write.append("\nCore Java");
        write.append("\nProgramming");
        write.close();
        System.out.println("written succesfully to the file");
    }
}
