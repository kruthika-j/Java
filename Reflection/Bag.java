package Reflection;

@MyCustomAnnotation(value = "Annotation in Bag")

public class Bag {
    private int pockets;
    String color;
    private final int pi=3;

    Bag(){}

    Bag(int p,String c){ 
        this.pockets=p;
        this.color=c;
        
    }
    public void display(){
        System.out.println( "color:"+color+"\nPockets:"+pockets+"\npi:"+pi);
    } 
@MethodAnnotation(value = "CustomMethodAnnotation")
    public void display(int i){
        System.out.println("this is another display method");
    }
    public String getName() {
        return "Kiruthika";
    }
}
