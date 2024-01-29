import java.util.*;
class Main{
    public static int [] myFun ( int [] a, int[] b, int i, int j, int ans [], int cur){
        if ( i == a.length && j == b.length) return ans;
        if ( i == a.length){
            ans [cur] = b[j];
            return myFun ( a, b, i , j+1,ans ,cur+1);
        }else if ( j == b.length){
            ans [cur] = a[i];
            return myFun (a,b,i+1,j,ans,cur+1);
        }else {
            if ( a[i] < b[j]){
                ans [cur] = a[i];
                return myFun (a,b,i+1,j,ans,cur+1);
            }else{
                ans [cur] = b[j];
                return myFun (a,b,i,j+1,ans,cur+1);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
       for( int i = 0; i<a.length; i++) 
        a[i] = sc.nextInt();
    for( int i = 0; i<b.length; i++) 
      b[i] = sc.nextInt();
        int ans [] = new int[2*n];
        ans = myFun(a,b,0,0,ans,0);
        for (Integer i : ans) 
        System.out.print(i + " ");
    }
}
