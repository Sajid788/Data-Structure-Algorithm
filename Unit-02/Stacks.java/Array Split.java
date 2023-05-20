import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int leftSum = 0;
            int totalSum = 0;
            
            for (int i = 0; i < n; i++) {
                totalSum += arr[i];
            }

            for (int i = 0; i < n - 1; i++) {
                leftSum += arr[i];
                totalSum -= arr[i];

                if (leftSum >= totalSum) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
