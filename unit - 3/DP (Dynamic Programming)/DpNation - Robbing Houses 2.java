import java.util.*; 
class Main{
    public static void main(String args []){ 
    Scanner sc = new Scanner(System.in); 
    int t = sc.nextInt(); 
       while (t-->0){ 
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        for ( int i=0; i<n; i++) 
        arr[i] = sc.nextInt();
        System.out.println(myFun(arr,n));
         }
     }
        public static int myFun(int arr [],int n){
            if (n==0) 
            return 0;
            if (n==1) 
            return arr[0]; 
            if (n==2) return Math.max(arr[1],arr[1]); 
            int []dp = new int [n]; 
            dp[0]  = arr[0]; 
            dp [1] = Math.max(arr[0],arr [1]);
            for (int i = 2; i<n; i++)
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
            return dp[n-1];
           }
        }
