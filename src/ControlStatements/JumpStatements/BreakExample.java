package ControlStatements.JumpStatements;

public class BreakExample {
    public static void main(String[] args) {
        for(int value = 1 ; value< 10; value++){
            if(value == 5){
                break;
            }
            System.out.println(value);
        }
    }
}
