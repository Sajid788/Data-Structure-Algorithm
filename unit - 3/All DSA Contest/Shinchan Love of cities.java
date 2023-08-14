import java.util.*;

public class Main {

    static long myFun(long[] arr1, long[] arr2) {
        long sum = 0;
        Arrays.sort(arr2);
        if (arr1[0] == 1) {
            return 0;
        } else {
            for (int i = 0; i < arr2.length - 1; i++) {
                sum += (arr2[i + 1] - arr2[i]) * arr1[1];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            long[] arr1 = new long[2];
            for (int j = 0; j < 2; j++) {
                arr1[j] = sc.nextLong();
            }
            long[] arr2 = new long[(int) arr1[0]];
            for (int j = 0; j < arr1[0]; j++) {
                arr2[j] = sc.nextLong();
            }
            long result = myFun(arr1, arr2);
            System.out.println(result);
        }
    }
}
