import java.util.*;

public class Main {

    static boolean isPossible(long[] q, long N, int M, long T) {
        int days = 1;
        long currDayTime = 0;

        for (int i = 0; i < N; i++) {
            if (q[i] > T) {
                return false;
            }

            if (currDayTime + q[i] > T) {
                days++;
                currDayTime = q[i];
            } else {
                currDayTime += q[i];
            }
        }

        return days <= M;
    }

    static long myFun(long[] q, long N, int M, long left, long right) {
        long ans = right;
        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (isPossible(q, N, M, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int M = sc.nextInt();

        long[] q = new long[(int) N];
        for (int i = 0; i < N; i++) {
            q[i] = sc.nextLong();
        }

        long totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += q[i];
        }

        long minTime = myFun(q, N, M, 0, totalSum);
        System.out.println(minTime);
    }
}
