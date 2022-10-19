package InteractiveProgramms;

import java.util.Scanner;

public class EvenOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers :");
        int n = sc.nextInt();
        for(int i = 1;i<=n ;i++)
            if(i%2==0){
                System.out.println(i+ "  EVEN");}
                else{
                    System.out.println(i+ "  ODD");
                }
            }
    }

