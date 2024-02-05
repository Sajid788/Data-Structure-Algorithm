import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int dp [] = new int [n];
        int maxValue = 0;
        for(int i = 0; i<n; i++){
            int max = 0;
        for(int j = 0; j<i; j++){
            if(arr[j]<arr[i]){
                max = Math.max(dp[j],max);
            }
        }
        dp [i] = max + 1;
        maxValue  = Math.max(maxValue, dp[i]);
        }
        System.out.println(maxValue);
    }
}
