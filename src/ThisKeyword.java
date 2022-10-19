public class ThisKeyword {
    int i ;
  /*  void setValue(int x){
        i=x ;
    }*/
    void setValue(int i){
        this.i = i ;
    }
    void display(){
        System.out.println(i);
    }
}
class PQR{
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword() ;
        tk.setValue(2);
        tk.display();

        ThisKeyword tk1 = new ThisKeyword() ;
        tk1.setValue(3);
        tk1.display();
    }
}
