package oops.Polymerphism.Overloading;

public class Addition {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    static float add(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Add 2 nos : " + add(1, 2));
        System.out.println("Add 3 nos : " + add(1, 2, 3));
        System.out.println("Add 4 nos : " + add(1, 2, 3, 4));
    }
}

    class OverloadingExample {
        public static void main(String[] args) {
            System.out.println("Add 2 float nos : " + Addition.add(2.5f, 5.3f));
            //use static method outside the class calling that class.
        }
    }



