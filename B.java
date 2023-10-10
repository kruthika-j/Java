
public class B extends A {
    public B() {
    }

    public static void main(String[] args) {
        A b = A.getInstance();
        b.hello();
        System.out.println(b.a);
    }
}
