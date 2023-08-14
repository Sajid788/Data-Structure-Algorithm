import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int Index = myFun(arr, n);
            System.out.println(Index);
        }
    }

    public static int myFun(int[] arr, int n) {
        int left = 0;
        int right = n - 1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid; 
            } else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }
}
