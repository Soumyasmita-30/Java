package Enum;

public class EnumWithSwitch {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.HIGH ;
        switch(myVar){
            case LOW :
                System.out.println("Low priority");
                break;
            case MEDIUM:
                System.out.println("Medium priority");
                break ;
            case HIGH:
                System.out.println("High priority");
                break ;
            default:
                System.out.println("Invalid bug");
        }
    }
}
