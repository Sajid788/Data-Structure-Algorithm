import java.util.*;
class Main{
    
    public static int myFun(int arr){
        if(arr== 0){
            return 0;
        }else{
            return arr % 2 + myFun (arr/2);
        }
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
         while(t-->0){
             int n = sc.nextInt();
             int [] arr = new int [n+1];
             for(int i = 1; i<=n; i++){
                arr[i] = myFun(i);
             }
            for(int num : arr){
                System.out.print(num +" ");
            }
            System.out.println();
         }
    }
}
