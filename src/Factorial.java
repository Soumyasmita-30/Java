import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            return 1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int fact = 1 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n< 0){
            System.out.println("Factorial of negative no is invalid");
        }else if(n== 0 || n==1){
            System.out.println("Factorial " +n+ " is " +fact);
        }
        else{
            for(int i =1; i<= n ;i++) {
                fact = fact * i;
            }
            System.out.println("Factorial " +n+ " is " +fact);
            }

        System.out.println("method factorial is : " +factorial(n));
        }




    }

