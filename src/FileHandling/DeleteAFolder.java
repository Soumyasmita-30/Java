package FileHandling;

import java.io.File;

public class DeleteAFolder {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HP\\IdeaProjects\\training\\File\\Java");
        if(obj.delete()) {
            System.out.println("Folder deleted successfully" + obj.getName());
        }else{
            System.out.println("Unable to delete the folder");
        }
    }
}
