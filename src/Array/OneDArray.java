package Array;

public class OneDArray {
    public static void main(String[] args) {
        String[] name = {"Rudra", "Sneha", "Sachin"};
        int[] numbers = {1, 2, 3, 4, 5};
        char[] letters = {'a', 'b', 'c', 'd', 'e'};

        System.out.println(name[0]);
       // System.out.println(name[4]);
        System.out.println(name.length);
        System.out.println(numbers.length);
        System.out.println(name[0].charAt(3));

        for(int i = 0 ; i<letters.length;i++) {
           // System.out.println(letters[i]);
            System.out.print(letters[i] + "  " );

        }
        for(int x : numbers){
            System.out.print(x + "  ");
        }
    }
}
