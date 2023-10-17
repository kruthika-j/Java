package Generics;

public class Printer<K> {
    K num;
    public Printer(K numToPrint){
          this.num=numToPrint;
    }
    public void printNum(){
        System.out.println("Number:"+ num);
    } 
}
