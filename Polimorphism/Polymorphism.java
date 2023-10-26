package Polimorphism;

class Adder{
    public int add(int a,int b){
        return a+b;
    }
     public int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Polymorphism extends Adder {
    //overriding
    
    public int add(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("hello");

        Adder a = new Adder();
        
        int sum = a.add(3,4);
        System.out.println(sum);
        //overloading
        int sum2 = a.add(3,4,5);
        System.out.println(sum2);
        //overriding
        Polymorphism p = new Polymorphism();
        int mul = p.add(2,3);
        System.out.println(mul + "overriding");

    }
}
