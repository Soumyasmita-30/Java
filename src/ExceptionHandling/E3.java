package ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            String str = "  ";
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            System.out.println(str);
        }

        finally
         {
            br.close();
        }
    }
}
