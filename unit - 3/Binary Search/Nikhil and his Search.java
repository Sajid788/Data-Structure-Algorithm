import java.util.*;

public class Main {
    static int findGreater(int[] arr, int N, int x) {
        int left = 0;
        int right = N - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return N - left;
    }

  static int findLess(int[] arr, int N, int x) {
        int left = 0;
        int right = N - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return N - left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); 

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            if (queryType == 0) {
                int result = findLess(arr, N, x);
                System.out.println(result);
            } else if (queryType == 1) {
                int result = findGreater(arr, N, x);
                System.out.println(result);
            }
        }
    }
}
