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

class C extends A{
    void printC(){
        System.out.println("C printed");
    }
}

public class Heirarchy {   //one parent muliple child
    public static void main(String[] args) {
        C c = new C();
        c.printA();
        Class<? extends C> name=c.getClass();
        System.out.println(name);

        A a = new A();
        Class<? extends A> AName=a.getClass();
        System.out.println(AName);
        
    }
}
