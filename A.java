
public class A {
    private static A instance;
    String a = "kiru";

    A() {
    }

    public static A getInstance() {
        if (instance == null) {
            instance = new A();
        } else {
            throw new IllegalStateException("InstanceAlreadyCreated.");
        }
        return instance;
    }

    public void hello() {
        System.out.println("hello");
    }
}
