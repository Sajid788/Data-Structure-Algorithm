import java.util.*; 
class Main{ 
    private static int myFun(int []arr , int n){ 
        int dp [] = new int [n]; 
        int i , j ;
        if (n == 0 || arr[0] == 0) 
        return Integer.MAX_VALUE;
        dp [0] = 0 ;
        for ( i=1 ; i<n; i++){ 
        dp [i] = Integer.MAX_VALUE; 
        for ( j=0; j<i ; j++){
            if ( i <= j + arr[j] && dp [j] != Integer.MAX_VALUE){ 
                dp [ i ] = Math.min(dp[i], dp[j]+1); 
                 }
            }
        } return dp [ n - 1 ] ; 
    } 
 public static void main (String[] args){ 
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt (); 
     sc.nextLine (); 
     int [] arr = new int [n];
     for ( int i = 0; i < n; i++) arr[i] = sc.nextInt();
     System.out.print(myFun(arr,n));
    }
}
