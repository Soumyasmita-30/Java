package InteractiveProgramms;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle  : ");
        int b = sc.nextInt();
        System.out.println("Enter the height of triangle : ");
        int h = sc.nextInt() ;

        int area = (b*h)/2 ;
        System.out.println("Area of triangle : " +area);
    }
}
