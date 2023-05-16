import java.util.*;
    class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[N];
            
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int left = 0;
            int right = arr.length - 1;
            boolean possible = false;
            
            while (left < right) {
                int sum = arr[left] + arr[right];
                
                if (sum == k) {
                    possible = true;
                    break;
                } else if (sum < k) {
                    left++;
                } else {
                    right--;
                }
            }
            
            if (possible) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
