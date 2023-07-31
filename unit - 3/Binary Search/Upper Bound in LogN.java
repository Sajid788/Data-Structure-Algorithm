import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        arr[i] = sc.nextInt();
        System.out.println(myFun(arr, n, k, 0, n ));
    }
    static int myFun(int[] arr, int N, int k, int low, int high) {
        int res = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (k < arr[mid]) {
                res = mid;
                high = mid ;
            } else
                low = mid + 1;
        }
        return res;
    }
}
