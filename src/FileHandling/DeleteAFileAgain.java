package FileHandling;

import java.io.File;

public class DeleteAFileAgain {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HP\\Desktop\\NEW\\SOUMYA\\seema.txt");
        if(obj.delete()){
            System.out.println("File gets deleted successfully : " +obj.getName());}
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
