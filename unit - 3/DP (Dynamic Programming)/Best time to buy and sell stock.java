import java.util.Scanner;

class Main {

    public static int myFun(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int max_diff = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int temp = prices[i] - min;
            if (temp > max_diff) {
                max_diff = temp;
            }
        }
        return max_diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
              while(t-->0){
            int n = sc.nextInt(); 
            int[] prices = new int[n];

            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt(); 
            }
            int ans = myFun(prices);
            System.out.println(ans);
        }
    }
}
