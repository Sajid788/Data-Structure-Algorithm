import java.util.*;
class Main{
    public static int myFun(int n, int p){
        if(p == 0){
            return 1;
        }
        return n*myFun(n, p-1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(myFun(n, p));
    }
}





