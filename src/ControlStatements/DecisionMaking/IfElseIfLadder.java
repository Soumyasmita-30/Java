package ControlStatements.DecisionMaking;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if(a>b && a>c){
            System.out.println(a+ " is the greatest .");
        }
            else if(b>a && b>c) {
            System.out.println(b + " is the greatest .");
        }
            else{
            System.out.println(c+ " is the greatest .");
        }
    }
}
