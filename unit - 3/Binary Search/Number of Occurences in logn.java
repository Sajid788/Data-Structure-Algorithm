import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(print(n, arr, k));
    }
    public static int print(int n, int[] arr, int k) {
        if (LB(n, arr, k) == -1) return 0;
        return (UB(n, arr, k) - LB(n, arr, k)) + 1;
    }
    public static int LB(int n, int[] arr, int k) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                result = mid;
            }
            if (arr[mid] >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
    static int UB(int n, int[] arr, int k) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                result = mid;
                start = mid + 1;
            }
            if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
