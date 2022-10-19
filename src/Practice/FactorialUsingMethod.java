package Practice;

import java.util.Scanner;

public class FactorialUsingMethod {
    public static int factorial(int n){
        if (n<0){
            return 1 ;}
        else if(n==0 || n==1){
            return 1 ;}
        else{
            return n * factorial(n-1);
        }

    }


    public static void main(String[] args) {
        System.out.println("method factorial is : " +factorial(4));
    }

    }