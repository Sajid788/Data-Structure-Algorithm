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
            int m = sc.nextInt();
            int arr1[] = new int[m];
            for (int i = 0; i < m; i++) {
                arr1[i] = sc.nextInt();
            }
            int[] result = myFun(arr, arr1);
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[] myFun(int[] arr, int[] arr1) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            boolean is = false;
            for (int j : arr1) {
                if (i == j) {
                    is = true;
                    break;
                }
            }
            if (!is) {
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
