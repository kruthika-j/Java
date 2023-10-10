
public class C extends A {
    public C() {
        super(); 
    }

    public static void main(String[] args) {
        A c = A.getInstance();
        c.hello();
        A a1 = new A();
        a1.hello();
    }
}
