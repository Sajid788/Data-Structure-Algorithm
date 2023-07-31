import java.util.*;

class Main {
    public static int myFun(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                if (k >= arr[low] && k <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] <= arr[high]) {
                if (k > arr[mid] && arr[high] >= k) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(myFun(arr, n, k)); 
    }
}
