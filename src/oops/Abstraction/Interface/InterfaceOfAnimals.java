package oops.Abstraction.Interface;

interface  InterfaceOfAnimals {
    public void size();
    public void colour();
}
class Panda implements InterfaceOfAnimals{
    @Override
    public void size() {
        System.out.println("Its size is average");
    }
    public void colour(){
        System.out.println("Its colour is black and white");
    }
}
class Fox implements InterfaceOfAnimals{
    @Override
    public void size() {
        System.out.println("its size is small");
    }@Override
    public void colour() {
        System.out.println("Its colour is brown");
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Panda p = new Panda();
        Fox f = new Fox() ;
        p.size();
        p.colour();
        f.size();
        f.colour();
    }
}