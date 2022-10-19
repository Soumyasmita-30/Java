package oops;

public class Employee {
    int empId;
    String name ;
    int salary ;

public Employee(int empId , String name ,int salary){
this.empId = empId ;
this.name = name;
this.salary = salary ;
    System.out.println("I am inside constructor");
}
void display(){
    System.out.println(this.empId + " " +this.name +" " +this.salary);
}

    public static void main(String[] args) {
        Employee emp1 = new Employee(100,"Raju",4000);
        Employee emp2 = new Employee(101,"Dewang",5000);
        emp1.display();
        emp2.display();
    }
}