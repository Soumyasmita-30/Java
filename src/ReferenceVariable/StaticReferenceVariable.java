package ReferenceVariable;

public class StaticReferenceVariable {
    static String str1 ;
    static String str2 = "Sachin" ;
    static int num1 ;
    static int num2 = 10 ;
    static boolean status ;
    static void display(){
        System.out.println(num2);
    }

    public static void main(String[] args) {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(status);
        display();
    }
}
