import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int ans = myFun(n, m);
            System.out.println(ans);
        }
    }
       public static int myFun(int n, int m) {
        int low = 1; 
        int high = m; 
           int ans = 1; 
          while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Math.pow(mid, n) <= m) {
                ans = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        
        return ans;
    }
}
