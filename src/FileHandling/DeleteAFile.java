package FileHandling;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HP\\IdeaProjects\\training\\File\\Java\\Demo.text");
        if(obj.delete()) {
            System.out.println("File deleted successfully : " + obj.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
