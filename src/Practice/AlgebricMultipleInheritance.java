package Practice;

interface  AlgebricMultipleInheritance {
    public int mul(int a,int b);
}
interface Box {
   public int div(int a,int b);
}
interface Cad{
    public int add(int a , int b);
}
class D implements AlgebricMultipleInheritance,Box,Cad {
   public int mul(int a, int b) {
        int c = a * b;
        return c;
    }

    public int div(int x, int y) {
        int z = x * y;
        return z;
    }

    public int add(int i, int j) {
        int k = i + j;
        return k;
    }
}
class Ear{
    public static void main(String[] args) {
        D d = new D() ;
        System.out.println( d.mul(2,3));
        System.out.println(d.div(4,2));
        System.out.println(d.add(5,6));
    }
}
