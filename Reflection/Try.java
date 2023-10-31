package Reflection;

class Simple{}    
@MyCustomAnnotation(value = "SomeValue")

public class Try{    
 public static void main(String args[]) throws Exception {    
  Class c=Class.forName("Simple");    
  System.out.println(c.getName());    
 }    
}    
