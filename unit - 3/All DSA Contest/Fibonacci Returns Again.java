import java.util.*;

class Main {
    public static long myFun(long n) {
        long[] dp = new long[(int) (n + 1)]; 
        Arrays.fill(dp, -1);
        return fibonacci(n, dp);
    }

    public static long fibonacci(long n, long[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[(int) n] != -1) {  
            return dp[(int) n];
        }

        dp[(int) n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[(int) n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(myFun(n));
    }
}
