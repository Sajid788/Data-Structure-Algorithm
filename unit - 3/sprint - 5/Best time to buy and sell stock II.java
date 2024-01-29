import java.util.*;
class Main{
    public static int myFun(int [] arr, int n){
        int maxProfit = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]>arr[i-1]){
                maxProfit += arr[i] - arr[i-1];
            }
        }
        return maxProfit;
    }
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr [i ] = sc.nextInt();
            }
        int result = myFun(arr, n);
        System.out.println(result);
        }
    }
}
