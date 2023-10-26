package Reflection;

public class Bag {
    private int pockets;
    String color;
    private int pi;

    Bag(){}
    Bag(int p,String c){
        this.pockets=p;
        this.color=c;
        this.pi = 3;
    }
    public void display(){
        System.out.println( "color:"+color+"\nPockets:"+pockets+"\npi:"+pi);
    } 
    public void display(int i){
        System.out.println("this is another display method");
    }
    public String getName() {
        return "Keerathana";
    }
}
