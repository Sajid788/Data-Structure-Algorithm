import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            int j = n - 1;
            int max = 0;
            int leftSum = arr[0];
            int rightSum = arr[j];

            while (i < j) {
                if (leftSum == rightSum) {
                    max = leftSum;
                    i++;
                    j--;
                    leftSum += arr[i];
                    rightSum += arr[j];
                } else if (leftSum < rightSum) {
                    i++;
                    leftSum += arr[i];
                } else {
                    j--;
                    rightSum += arr[j];
                }
            }
            System.out.println(max);
        }
    }
}
  // output 100  0
