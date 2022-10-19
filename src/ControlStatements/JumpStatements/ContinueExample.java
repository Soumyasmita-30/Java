package ControlStatements.JumpStatements;

public class ContinueExample {
    public static void main(String[] args) {
        for(int value = 1 ; value< 10; value++){
            if(value == 5){
                continue;
            }
            System.out.println(value);
        }
    }
}


