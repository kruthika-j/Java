package Exception;

public class TryCatch {  
  
    public static void main(String[] args) {  
        try  
        {  
        for(int i=3;i<=0;i++){
            int data=12/i;
        }
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  