import java.util.*;
public class Hashset {
    public static void main(String[] args){
        Set<String> fruitSet = new HashSet<String>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Strawberry");
        System.out.println("Here are the elements.");
    for (String i : fruitSet)
        System.out.println(i);

   }
}