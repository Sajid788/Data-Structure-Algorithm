import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int A1 = sc.nextInt();
            int A2 = sc.nextInt();
            int n = sc.nextInt();
            int MOD = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = A1;
            arr[1] = A2;
            for (int i = 2; i < n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % MOD;
            }
            long[] ans = new long[MOD];
            for (int temp : arr) {
                ans[temp]++;
            }
            long max = 0;
            for (long f : ans) {
                max += f * f;
            }
            System.out.println(max);
        }
    }
}
