package InteractiveProgramms;

import java.util.Scanner;

public class SumOfTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2 ;
        System.out.println(sum);

        int mySum = 0;
        for(int i = 0; i<=n;i++){
            mySum = mySum+i ;
            System.out.println(mySum);
        }
        }
    }

