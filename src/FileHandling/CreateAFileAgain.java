package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFileAgain {
    public static void main(String[] args) throws IOException {
        File obj = new File("C:\\Users\\HP\\Desktop\\NEW\\SOUMYA\\seema.txt");
        if(obj.createNewFile()){
            System.out.println("File is being created: " +obj.getName());}
        else{
            System.out.println("File already exists ");
        }
    }
}
