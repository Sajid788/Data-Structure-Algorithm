import java.util.*;
public class Main{
     public static long myFun(int[]weight,int[]val,int n,int m,long[][]dp){
         if (n==0){ 
             return 0; 
         }
        if (m == 0 || m < 0){ 
        return 0; 
        }
        if(dp[n][m] != -1){
        return dp[n][m]; 
        }
        if (weight[n-1] > m){
        return myFun(weight,val,n-1,m,dp);
        } 
        long sell = val[n-1] + myFun(weight,val,n,m-weight[n-1],dp); 
        long notSell = myFun(weight,val,n-1,m,dp);
        dp[n][m] = Math.max(sell,notSell);
        return dp[n][m];
         }
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int []val = new int[n];
        for (int i = 0; i < n; i++){ 
        val [i] = sc.nextInt(); 
        } 
        int []weight = new int[n]; 
        for (int i = 0; i < n; i++){
            weight [i] = i + 1; 
        }
        long [][]dp = new long[n + 1][m+1]; 
        for (int i = 0; i <= n; i++){ 
        for (int j = 0; j <= m; j++){
            dp[i][j]= -1;
           }
        }
        long result = myFun(weight,val,n,m,dp);
        System.out.println(result);
        }
     }
        
