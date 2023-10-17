package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    private String privateField;

    public MyClass() {
        this.privateField = "Hello, Reflection!";
    }

    public void display() {
        System.out.println(privateField);
    }
}

public class Reflection {
    public static void main(String[] args) {
        Class<?> myClass = MyClass.class;
        System.out.println("Class Name: " + myClass.getName());
        Field[] fields = myClass.getDeclaredFields();
        System.out.println("\nDeclared Fields:");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Method[] methods = myClass.getDeclaredMethods();
        System.out.println("\nDeclared Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

