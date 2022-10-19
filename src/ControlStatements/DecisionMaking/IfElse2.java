package ControlStatements.DecisionMaking;

public class IfElse2 {
    public static void main(String[] args) {
        String name = "Saurav" ;
        int age = 23 ;
        if(age>= 18) {
            System.out.println(name + "  is eliginle for voting .");
        }else{
            System.out.println(name+ "is not eligible for voting .");
        }

        String result = (age>= 18) ? " Eligible " : " Not Eligible " ;
        System.out.println(name + "  " +result);
    }
}
