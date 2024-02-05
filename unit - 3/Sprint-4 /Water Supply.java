import java.util.*;
class Main{
    static boolean myFun(int n, int k){
        int st = 1, ed = n;
        
        while(st<=ed){
            int mid  = st + (ed - st)/2;
            int x = mid - 1;
            int ans = (int) Math.ceil((double) k/(x + 1));
            
            if(x + ans <=n){
                return true;
            }else{
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            boolean result  = myFun(n, k);
            if(result){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
