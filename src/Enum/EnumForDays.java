package Enum;

public class EnumForDays {
    enum Days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    public static void main(String[] args) {
        Days day = Days.WEDNESDAY;
        switch(day){
            case MONDAY :
                System.out.println("Day is Monday");
                break;
            case TUESDAY:
                System.out.println("Day is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Day is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Day is Thursday");
                break;
            case FRIDAY:
                System.out.println("Day is Friday");
                break;
            case SATURDAY:
                System.out.println("Day is Saturday");
                break;
            case SUNDAY:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
