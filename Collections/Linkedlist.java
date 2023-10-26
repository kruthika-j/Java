package Collections;
import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        List<String> a = new LinkedList<String>();
        String[] fruits = {"apple","banana","grapes"};

        for(int i=0;i<fruits.length;i++){
            a.add(fruits[i]);
        }

        for(int j=0;j<a.size();j++){
            System.out.println(a.get(j));
        }
    }
}
