package InteractiveProgramms;

import java.util.Scanner;

public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of cuboid : ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of cuboid : ");
        int b = sc.nextInt() ;
        System.out.println("Enter the height of cuboid : ");
        int h = sc.nextInt() ;

        int tsa = 2*(l*b + b*h + l*h);
        System.out.println("Total surface area of cuboid :" +tsa);
    }
}
