package Practice;

public class enumE {
    enum Priority{
        HIGH,LOW,MEDIUM
    }

    public static void main(String[] args) {
        Priority p1 = Priority.HIGH ;
        Priority p2 = Priority.LOW ;
        Priority p3 = Priority.MEDIUM ;
        System.out.println(p2);

        for(Priority o : Priority.values()){
            System.out.println("\n"+o);
        }
    }
}
