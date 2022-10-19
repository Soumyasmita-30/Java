package InteractiveProgramms;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount : ");
        int p = sc.nextInt();
        System.out.println("Enter time in years : ");
        int t = sc.nextInt() ;
        System.out.println("Enter rate of interest in % : ");
        int r = sc.nextInt() ;

        int si = (p*t*r)/100 ;
        System.out.println("The simple interest is : " +si);
    }
}
