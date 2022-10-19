package ExceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i ,j,k = 0;
        try {
             i = 10;
             j = 2;
             k = i / j;
            System.out.println(k);

            int[] numbers = {1,2,3,4,5,6} ;
            System.out.println(numbers[7]);
        }
        catch(ArithmeticException e){
            System.out.println("Invalid division");}
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid limit for Array");}
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            System.out.println("Exiting the code/releasing the memory" );
        }
        System.out.println(k);
    }
}




