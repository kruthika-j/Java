package com.zirius.zerp.Package2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

public class ref {
    public static void main(String[] args) {
        
        Set<Class> classes = findAllClassesUsingClassLoader("com.zirius.zerp.Package2");
        
        if (classes.isEmpty()) {
            System.out.println("No classes found in the package.");
        } else {
            System.out.println("Classes found in the package:");
            for (Class clazz : classes) {
                System.out.println(clazz.getName());
            }
        }
    }
    public static Set<Class> findAllClassesUsingClassLoader(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream)); 

        return reader.lines()
          .filter(line -> line.endsWith(".class"))
          .map(line -> getClass(line, packageName))
          .collect(Collectors.toSet());
    }
 
    private static Class getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "."
              + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            // handle the exception
        }
        return null;
    }
}
