package FileHandling;

import java.io.File;

public class CreatingAFolder {
    public static void main(String[] args) {
        File object = new File("C:\\Users\\HP\\IdeaProjects\\training\\File\\Java");
        if(object.mkdir()) {
            System.out.println("Folder created :" + object.getName());
        }else{
            System.out.println("The Folder already exists");
        }
    }
}
