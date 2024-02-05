import java.util.*;
public class Main {
    static int myFun(int N) {
        if (N < 0) {
            return 0;
        }
        int[] dp = new int[N + 1];
        dp[0] = 1;
        return fibonacci(N, dp);
    }

    static int fibonacci(int N, int[] dp) {
        if (N < 0) {
            return 0;
        }

        if (dp[N] != 0) {
            return dp[N];
        }

        dp[N] = fibonacci(N - 1, dp) + fibonacci(N - 3, dp) + fibonacci(N - 4, dp);
        return dp[N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(myFun(N));
    }
}
