package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import Reflection.Bag;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException,
            InvocationTargetException, NoSuchMethodException, SecurityException {
        Bag b1 = new Bag(2, "black");
        b1.display();

        System.out.println(b1.getClass());

        System.out.println("----Fields----");

        Field[] fields = b1.getClass().getDeclaredFields();

        for (Field b : fields) {

            if (b.getName().equals("pi")) {
                b.setAccessible(true);
                b.set(b1, 5);
                b1.display();
            }
        }

        System.out.println("------Method-----");

        Method[] methods = b1.getClass().getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m);

            if (m.getName().equals("display") && m.getParameterTypes().length == 1) {
                m.invoke(b1, 4);
                System.out.println("method invoked");
            }
        }

        Class<Bag> bagClass = Bag.class;

        Method getNameMethod = bagClass.getDeclaredMethod("getName");
        System.out.println(getNameMethod);
        getNameMethod.setAccessible(true);

        int modifiers = getNameMethod.getModifiers();

        if (Modifier.isPublic(modifiers)) {
            System.out.println("The getName method is public." + modifiers);
        } else if (Modifier.isPrivate(modifiers)) {
            System.out.println("The getName method is private.");
        } else if (Modifier.isProtected(modifiers)) {
            System.out.println("The getName method is protected.");
        } else {
            System.out.println("The getName method has default (package-private) access.");
        }

        System.out.println("----constructor----");

        Constructor<?>[] constr = b1.getClass().getDeclaredConstructors();
        for (Constructor<?> c : constr) {
            if (c.getParameterTypes().length == 2) {
                System.out.println(c.getName());
            }
        }
    }
}
