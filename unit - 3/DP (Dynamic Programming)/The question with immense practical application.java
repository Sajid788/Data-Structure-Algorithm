import java.util.*; 
  class Main{ 
public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in); 
    int t = sc.nextInt();
    while(t-->0){
        String s1 = sc.next(); 
        String s2 = sc.next (); 
        int a = s1.length(); 
        int b = s2.length(); 
        int dp[][] = new int[a+1][b+1];
        for (int i=0; i<=a; i++){ 
        for (int j=0; j<=b; j++){ 
        dp[i][j] = -1;
             }
           }
        System.out.println(myFun(s1, s2, a, b, dp));
        }
    }
    public static int myFun(String s1, String s2, int a, int b, int dp[][]){ 
       if(a==0) 
       return b; 
       if(b==0) 
       return a; 
       if(dp[a][b] != -1) 
        return dp[a][b]; 
         if (s1.charAt(a-1) == s2.charAt(b-1)) 
        return myFun (s1, s2, a-1, b-1, dp);
        dp[a][b] = 1 + minIt(myFun(s1, s2, a, b-1, dp), 
        myFun(s1, s2, a-1, b, dp), 
        myFun(s1, s2, a-1, b-1, dp));
           return dp[a][b]; 
        }
          public static int minIt (int a, int b, int c){
           int temp  = Math.min(a, b); 
           return Math.min(temp, c); 
     }
}
