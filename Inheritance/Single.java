package Inheritance;

class A{
    void printA(){
        System.out.println("A printed");
    }
}

class B extends A{
    void printB(){
        System.out.println("B printed");
    }
}

public class Single {
    public static void main(String[] args) {
        B b = new B();
        b.printA();
        b.printB();
    }
}
