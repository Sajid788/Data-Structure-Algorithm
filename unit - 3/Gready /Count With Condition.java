import java.util.*;

public class Main {

    static int myFun(int[] arr, int index, int k, int sum) {
        if (index == arr.length) {
            if (sum == k)
                return 1;
            else
                return 0;
        }

        int count = myFun(arr, index + 1, k, sum + arr[index]);
         int result = myFun(arr, index + 1, k, sum);

        return count + result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = myFun(arr, 0, k, 0);
        System.out.println(count);
        
    }
}
