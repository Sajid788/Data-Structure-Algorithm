import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean result = myFun(arr, n, k);
        System.out.println(result ? "True" : "False");
    }

    static boolean myFun(int[] arr, int n, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        return set.size() >= k;
    }
}
