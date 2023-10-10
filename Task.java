import java.util.*; 
class Task {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("input");
        for(int i=0;i<n;i++){
            int x =sc.nextInt();
            if(x==0||x==1||x==2){
                arr[i]=x;
            }
            else{
                break; 
           }
        }
        Arrays.sort(arr);
        System.out.println("output");
        for(int j:arr){
            System.out.print(j+" ");
        }
        sc.close();
    }
}
