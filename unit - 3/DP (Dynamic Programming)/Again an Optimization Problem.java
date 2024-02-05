import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        for (int t = 0; t < T; t++) {
            int S = sc.nextInt(); 
            int N = sc.nextInt(); 
            
            int[] weights = new int[N];
            int[] values = new int[N];
            
            for (int i = 0; i < N; i++) {
                weights[i] = sc.nextInt();
                values[i] = sc.nextInt();
            }
            
            int[][] dp = new int[N + 1][S + 1];
            
            for (int i = 1; i <= N; i++) {
                for (int w = 1; w <= S; w++) {
                    if (weights[i - 1] <= w) {
                        dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                    } else {
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }
            
            System.out.println(dp[N][S]);
        }
    }
}
