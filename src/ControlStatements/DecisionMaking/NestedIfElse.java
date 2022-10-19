package ControlStatements.DecisionMaking;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksEnglish = 82 ;
        int marksMathematics = 83 ;
        String name = "Sachin" ;
        if(marksEnglish > 80) {
            if (marksMathematics > 80) {
                System.out.println("Congratulations " + name + " .You get a video game !!");
            }
            else {
                System.out.println("Congratulations " + name + " .You get a football");
            }
        }
            else{
                System.out.println("Sorry " + name + " .You need to study harder...!!");
            }
        }
    }

