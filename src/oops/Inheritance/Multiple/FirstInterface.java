package oops.Inheritance.Multiple;

interface FirstInterface {
    public void method1();
}
interface SecondInterface{
    public void method2();
}
interface ThirdInterface{
    public void method3();
}
class MIDemo implements FirstInterface,SecondInterface,ThirdInterface{
    @Override
    public void method1() {
        System.out.println("ChromeBrowser");
    }
    @Override
    public void method2() {
        System.out.println("BraveBrowser");
    }
    @Override
    public void method3() {
        System.out.println("TrameBrowser");
    }
}
class MIExample{
    public static void main(String[] args) {
        MIDemo mid = new MIDemo();
        mid.method1();
        mid.method2();
        mid.method3();

    }
}