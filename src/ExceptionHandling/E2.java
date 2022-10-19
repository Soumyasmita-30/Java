package ExceptionHandling;

public class E2 {
    static void ageCheck(int age){
        if(age<18) {
            throw new ArithmeticException("Access denied- Age is less than 18");
        }
        else{
            System.out.println("Access granted - You are eligible");
        }
    }

    public static void main(String[] args) {
        ageCheck(17);
    }
}
