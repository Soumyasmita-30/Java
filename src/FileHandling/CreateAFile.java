package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {
        try{
            File obj = new File("C:\\Users\\HP\\IdeaProjects\\training\\File\\Java\\Demo.text");
            if(obj.createNewFile()) {
                System.out.println("File created successfully :" + obj.getName());
            }else{
                System.out.println("File already exists");
            }

            }catch(IOException e){
            System.out.println("Something Unexpected happened");
        }

    }
}
