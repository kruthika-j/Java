package Reflection;

class MyClass {
}

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        // Using a class literal
        Class<?> class1 = MyClass.class;

        // Using Class.forName()
        Class<?> class2 = Class.forName("MyClass");

        // Using .getClass() on an object
        MyClass obj = new MyClass();
        Class<?> class3 = obj.getClass();

        System.out.println(class1 == class2 && class2 == class3); // Should print true
    }
}
