package Abstraction;

abstract class Animal{
    int i=10;
    public abstract void sound();
    public void display(){
        System.out.println("display method"+i);
    } 
}

class Cat extends Animal {
         public void sound() {
        System.out.println("Cat meow");
         }
    }

public class AbstractClass{
    public static void main(String[] args) {
        Cat c =new Cat();
        c.sound();
        c.display();
    }
}
   

