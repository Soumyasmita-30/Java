package FileHandling;

import java.io.File;

public class DeletingAFolderAgain {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HP\\Desktop\\NEW\\SOUMYA");
        if(obj.delete()) {
            System.out.println("Folder deleted successfully : " + obj.getName());
        }else{
            System.out.println("Unable to delete a Folder");
        }
    }
}
