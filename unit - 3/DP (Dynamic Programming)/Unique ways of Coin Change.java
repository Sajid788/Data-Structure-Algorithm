import java.util.*;

class Main {
    public static long myFun(int[] arr, int n, int m, long[][] dp) {
        if (n == 0) {
            return 1;
        }
        if (n < 0 || m == 0) {
            return 0;
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        dp[m][n] = myFun(arr, n - arr[m - 1], m, dp) + myFun(arr, n, m - 1, dp);
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        long[][] dp = new long[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        long result = myFun(arr, n, m, dp);
        System.out.println(result);
    }
}
