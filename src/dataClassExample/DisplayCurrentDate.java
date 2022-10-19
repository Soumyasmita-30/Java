package dataClassExample;

import java.time.LocalDate;

public class DisplayCurrentDate {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        System.out.println("Todays date is : " +obj);
    }
}
