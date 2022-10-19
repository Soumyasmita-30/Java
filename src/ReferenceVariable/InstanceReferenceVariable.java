package ReferenceVariable;

public class InstanceReferenceVariable {
    int a = 10;
    String name = "Raju" ;
    void display(){
        System.out.println(name);
    }


    public static void main(String[] args) {
        InstanceReferenceVariable obj = new InstanceReferenceVariable();
        System.out.println(obj.a);
        System.out.println(obj.name);




            InstanceReferenceVariable obj1 = new InstanceReferenceVariable();
            obj1.display();
        }
    }

