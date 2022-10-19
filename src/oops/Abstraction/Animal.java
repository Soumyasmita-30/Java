package oops.Abstraction;

import java.util.concurrent.Callable;

 abstract public class Animal {
    public abstract void sound();
    public void run(){
        System.out.println("The Animal runs...!!");
    }
}
class Turtle extends Animal{
    public void sound(){
        System.out.println("The Turtle moves very slowly....!!");
    }
}
class Cheetah extends Animal{
    public void sound(){
        System.out.println("The Cheetah runs very fast...!!");
    }
}
class Abstraction{
    public static void main(String[] args) {
        Turtle t1 = new Turtle() ;
        t1.sound();
        t1.run();
        Cheetah c1 = new Cheetah();
        t1.sound();
        t1.run();
    }
        }


