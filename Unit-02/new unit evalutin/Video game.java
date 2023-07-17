import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Long[] arr = new Long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        Arrays.sort(arr);
        
        int left = 0;
        int right = n - 1;
        
        while (k > 0 && right >= 0) {
            k -= arr[right];
            left++;
            right--;
        }
        
        System.out.println(left);
    }
}
