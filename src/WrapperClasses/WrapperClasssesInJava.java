package WrapperClasses;

public class WrapperClasssesInJava {
    public static void main(String[] args) {
        Integer integer = 678 ;
        Double newDouble = 3.14 ;
        Character character = 'A' ;
        System.out.println(integer.intValue());
        System.out.println(newDouble.doubleValue());
        System.out.println(character.charValue());
        String newstring = integer.toString();
        System.out.println(newstring.length());

    }
}
