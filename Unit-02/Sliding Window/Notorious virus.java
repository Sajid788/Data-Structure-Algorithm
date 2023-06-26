import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] files = new int[N];

        for (int i = 0; i < N; i++) {
            files[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            currentSum += files[i];
            
            if (files[i] > maxVal) {
                maxVal = files[i];
            }
            
            if (currentSum - maxVal > maxSum) {
                maxSum = currentSum - maxVal;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
                maxVal = Integer.MIN_VALUE;
            }
        }

        System.out.println(maxSum);
    }
}
