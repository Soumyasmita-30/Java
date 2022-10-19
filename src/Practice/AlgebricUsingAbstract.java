package Practice;

abstract public class AlgebricUsingAbstract {
   abstract public int add(int a,int b);
   abstract public int sub(int a,int b);
}
class A extends AlgebricUsingAbstract{
   public int add(int a,int b){
         int c = a+ b ;
    return c ;}

   public int sub(int a,int b){
         int c = a- b;
    return c ;}
    }
    class B extends AlgebricUsingAbstract{
        @Override
        public int add(int a, int b) {
             int c = a+b ;
        return c ;}

        @Override
       public int sub(int a, int b) {
             int c = a-b;
        return c ;}
        }
        class De{
            public static void main(String[] args) {
                A a = new A();
                B b = new B();
                System.out.println( a.add(2,4));
                System.out.println( a.sub(7,5));
                System.out.println(b.add(10,20));
                System.out.println(b.sub(20,10));
            }
    }

