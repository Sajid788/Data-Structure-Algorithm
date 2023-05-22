import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int[] ans = new int[n];
            int[] stack = new int[n];
            int top = 0;

            for (int i = 0; i < n; i++) {
                while (top >= 0 && arr[i] > arr[stack[top]]) {
                    int prevDay = stack[top--];
                    ans[prevDay] = i - prevDay;
                }
                stack[++top] = i;
            }

            while (top >= 0) {
                int prevDay = stack[top--];
                ans[prevDay] = 0;
            }

            for (int i = 0; i < n; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
