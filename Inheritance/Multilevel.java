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

class C extends B{
    void printC(){
        System.out.println("C printed");
    }
}
public class Multilevel {
    public static void main(String[] args) {
         C c = new C();
         c.printA();
         c.printB();
         c.printC();
    }
   
}
