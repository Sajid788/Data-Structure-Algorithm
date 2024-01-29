import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
          while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
             for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = myFun(arr, k);
            System.out.println(result);
        }
    }
    static int myFun(int[] arr, int k) {
        int left = 1;
        int right = Arrays.stream(arr).sum();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isFeasible(arr, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    static boolean isFeasible(int[] arr, int k, int capacity) {
        int days = 1;
        int ans = capacity;
        
        for (int num : arr) {
            if (num > capacity) {
                return false;
            }
            
            if (ans < num) {
                days++;
                ans = capacity;
                }
             ans -= num;
            
            if (days > k) {
                return false;
            }
        }
        return true;
    }
}
