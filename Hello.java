import java.util.*;
public class Hello
{
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		final int number;
		number = 12;
		System.out.println(number);
		num = 20;
		System.out.println(num);
        // number = 30;
        // System.out.println(number);
        System.out.println("final keyword is for unchangeable"+" "+number);
        String txt = "Hello";
        System.out.println("Length of text is "+ txt.length());
        System.out.println("Uppercase of text is "+ txt.toUpperCase());
        System.out.println("lowercase of text is "+ txt.toLowerCase());
        System.out.println("Upp "+ txt.indexOf("els"));
        System.out.println(Math.min(10,20));
        System.out.println(Math.random());

        //Arrays
        String[] arr = {"red","blue","green"};
        System.out.println(arr[1]);
        arr[1]="grey";
        System.out.println(arr[1]);
        for(String i:arr){
            System.out.println(i);
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
        	    //myMethod();
    System.out.println(myMethod());
}
    static int myMethod(){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int a = sc.nextInt();
    System.out.println("Enter number2");
    int b = sc.nextInt();
    int sum = a+b;
     sc.close();
	return sum;
}

}
