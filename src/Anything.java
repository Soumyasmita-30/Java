public class Anything {
    int cube(){
    int a = 4;
    int c = a*a*a ;
        System.out.println(" cube is : " +c);
        return c ;}

}
class BB extends Anything{
    int square(){
        int x = 2 ;
        int y = x*x ;
        System.out.println("Square is : " +y);
        return y ;
    }
}
class CC extends BB{
    void evenodd(){
        int a = 3;
        if(a% 2 == 0){
            System.out.println("The no is :  even");}
            else{
                System.out.println("The no is : odd");
            }
        }
    }

class DD extends CC{
    public static void main(String[] args) {
        DD d = new DD();
        d.cube();
        d.square() ;
        d.evenodd();
    }
}
