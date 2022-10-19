package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFileAgain {
    public static void main(String[] args) throws IOException {
        FileWriter write = new FileWriter("C:\\Users\\HP\\Desktop\\NEW\\SOUMYA\\seema.txt");
        write.append("Hello");
        write.append("\n Hi everyone\n");
        write.append("CoreJava");
        write.close();
        System.out.println("successfully writteen in file");
    }
}
