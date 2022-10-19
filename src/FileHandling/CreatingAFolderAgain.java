package FileHandling;

import java.io.File;

public class CreatingAFolderAgain {
    public static void main(String[] args) {
        File object = new File("C:\\Users\\HP\\Desktop\\NEW\\SOUMYA");
        if(object.mkdir()) {
            System.out.println("folder created :" + object.getName());
        }  else{
            System.out.println("The folder already exists.");
        }
    }
}
