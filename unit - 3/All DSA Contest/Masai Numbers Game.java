import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        myFun(n, arr);
    }

    public static void myFun(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int k = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    k = j;
                    break;
                }
            }

            int ans = -1;

            if (k == -1) {
                System.out.print(-1 + " ");
            } else {
                for (int p = k; p < n; p++) {
                    if (arr[p] < arr[k]) {
                        ans = arr[p];
                        break;
                    }
                }
                System.out.print(ans + " ");
            }
        }

        System.out.println();
    }
}
