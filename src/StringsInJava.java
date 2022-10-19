public class StringsInJava {
    public static void main(String[] args) {
        String name = "Java Programming";
        System.out.println("We are learning : " +name);
        System.out.println(name.toLowerCase());
        System.out.println("Original string : " +name);
        System.out.println(name.toUpperCase());

        String last = "Language" ;
        System.out.println(name+ " " +last);//string concatenation
        System.out.println(name + last);

        System.out.println(name.indexOf("Pro"));
        System.out.println(name.indexOf("r",7));

        String spaceVar = "       Software Testing        " ;
        System.out.println(spaceVar);
        System.out.println(spaceVar.trim());

        System.out.println(name.charAt(0));
    }
}
