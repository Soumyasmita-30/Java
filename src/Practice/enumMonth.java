package Practice;

public class enumMonth {
    enum Month{
        JAN,FEB,MARCH,APRIL,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC
    }

    public static void main(String[] args) {
        Month m = Month.AUG ;
        switch(m){
            case JAN :
                System.out.println("JANUARY");
                break;
            case FEB :
                System.out.println("FEBRUARY");
                break;
            case MARCH :
                System.out.println("MARCH");
                break;
            case APRIL :
                System.out.println("APRIL");
                break;
            case MAY :
                System.out.println("MAY");
                break;
            case JUNE :
                System.out.println("JUNE");
                break;
            case JULY :
                System.out.println("JULY");
                break;
            case AUG:
                System.out.println("AUGUST");
                break;
            case SEP :
                System.out.println("SEPTEMBER");
                break;
            case OCT :
                System.out.println("OCTOBER");
                break;
            case NOV :
                System.out.println("NOVEMBER");
                break;
            case DEC :
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
