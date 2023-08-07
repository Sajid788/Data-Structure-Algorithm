import java.util.*;
class Main{
    public static int myFun(int n){
        if(n<0){
            return 0;
        }
         if(n==0){
            return 1;
        }
        return myFun(n - 5) + myFun(n - 3) + myFun (n - 1);
    } 
    
    
 public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println(myFun(n));
  }
}
