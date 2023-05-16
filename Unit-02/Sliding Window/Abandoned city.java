import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int target = sc.nextInt(); 

            int[] coins = new int[N];
            for (int i = 0; i < N; i++) {
                coins[i] = sc.nextInt(); 
            }

            int[] arr = new int[N];
            arr[0] = coins[0];

            for (int i = 1; i < N; i++) {
                arr[i] = arr[i - 1] + coins[i];
            }

            int left = 0;
            int right = 0;
            int minDistance = Integer.MAX_VALUE;

            while (right < N) {
                int currentCoins = arr[right] - (left > 0 ? arr[left - 1] : 0);

                if (currentCoins >= target) {
                    minDistance = Math.min(minDistance, right - left + 1);
                    left++;
                } else {
                    right++;
                }
            }

            int shortestDistance = (minDistance != Integer.MAX_VALUE) ? minDistance : -1;
            System.out.println(shortestDistance);
        }
    }
}
