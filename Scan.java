import java.util.*;
public class Scan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name =  sc.nextLine();
        System.out.println(name);
        sc.close();

        encap e = new encap();
        e.setName("Encapsulation");
        System.out.println(e.getName());
    }
}

//encapsulation

class encap{
    private String a="fu";
    public void setName(String name){
        this.a=name;
    }
    public String getName(){
        return a;
    }
}



