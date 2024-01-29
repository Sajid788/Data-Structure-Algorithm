import java.util.*;

class comp implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

class Main {
    public static int myFun(Integer[] arr, int k) {
        int[] ans = new int[arr.length];
        int count = 0;
        ans[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) ans[i] = ans[i - 1];
            else ans[i] = i + 1;
        }
        for (int i = 0; i < ans.length; i++) if (ans[i] <= k) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr, new comp());
            
            int count = myFun(arr, k);
            System.out.println(count);
        }
    }
}
