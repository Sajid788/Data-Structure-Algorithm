import java.util.*;
class Main{
    public static String  myFun(int n){
        if(n==0){
            return "0";
        }else if(n==1){
            return "1";
        }
        return myFun(n/2) + (n % 2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(myFun(n));
        }
        
    }
}





