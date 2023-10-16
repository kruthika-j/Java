
public class C extends A {
    public C() {
    }

    public static void main(String[] args) {
        A c = A.getInstance();
        c.hello();
    }
}
