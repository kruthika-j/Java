package Reflection;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
   

public class ReflectionExample {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Bag b1=new Bag(2,"black");
        b1.display();

        System.out.println( b1.getClass());

        System.out.println("----Fields----");

        Field[] fields = b1.getClass().getDeclaredFields();
        
       for(Field b : fields){
        
         if(b.getName().equals("pi")){
            b.setAccessible(true);
            b.set(b1, 5);
            b1.display();
         }
       }

       System.out.println("------Method-----");

         Method[] methods = b1.getClass().getDeclaredMethods();

         for(Method m:methods){
            System.out.println("dfghjkl");

            if(m.getName().equals("display") && m.getParameterTypes().length==1){
                    m.invoke(b1, 4);
                    System.out.println("method invoked");
                }
            }
        System.out.println("----constructor----");

        Constructor<?>[] constr =b1.getClass().getDeclaredConstructors(); 
        for(Constructor<?> c: constr ){
            if(c.getParameterTypes().length==2){
                System.out.println(c.getName());
            }
        }
    }
}
    

