package Generics;

class Simple<T> {
    private T num; 

    public Simple(T num){
        this.num=num;
    }
    public T display(){
        return num;
    }
}

public class Main{
    public static void main(String[] args) {
        Simple<Integer> s=new Simple<>(3);
        Integer res=s.display();
        System.out.println(res);
    }

}
