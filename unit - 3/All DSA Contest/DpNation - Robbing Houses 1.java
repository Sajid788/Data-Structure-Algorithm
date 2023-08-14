import java.util.*;
public class Main{
    public static int myFun (int [] arr , int N , int [] dp ){ 
        if ( N <= 0 ){
           return 0;
        }
         if (dp[N]!=-1){ 
         return dp [N];
         }
        int take = arr [N-1] + myFun (arr , N - 2 , dp); 
        int leave = myFun (arr , N - 1 , dp) ;
        return dp [N] = Math.max (take , leave) ; 
         } 
         public static void main ( String [] args ) {
            Scanner sc = new Scanner (System.in);
             int t = sc.nextInt () ; 
             while (t-->0){ 
            int N = sc.nextInt (); 
            int [] arr = new int [N] ; 
            for ( int i = 0; i < N; i++ ) { 
            arr [i] = sc.nextInt() ; 
            } 
            int [] dp = new int [N + 1] ;
            for (int i = 0; i<N+1 ; i++){ 
                dp [i] = -1; 
                } 
            System.out.println(myFun(arr , N , dp));
             }
         }
    }
