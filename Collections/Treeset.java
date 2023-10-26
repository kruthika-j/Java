package Collections;
import java.util.*;
public class Treeset{
    public static void main(String [ ] args){
        Set<String> fruits = new TreeSet<String>();
        fruits.add("apple"); 
        fruits.add("banana");
        fruits.add("grapes"); 
        Iterator it = fruits.iterator();
       while (it.hasNext()){
        System.out.println(it.next());
        } 
    } 
}