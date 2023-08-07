import java.util.*;
class Main{
    public static int myFun(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
           return 1; 
        }
        return myFun(n-4) + myFun(n-8);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        System.out.println(myFun(n));
        }
    }
}
