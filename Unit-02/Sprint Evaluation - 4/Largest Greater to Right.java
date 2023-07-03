import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++)
                arr[i] = sc.nextInt();

            int[] ans = new int[num];
            Stack<Integer> st = new Stack<>();
            int max = Integer.MIN_VALUE;
            for (int i = num - 1; i >= 0; i--) {
                    max = Math.max(max,arr[i]);
                while (!st.isEmpty() && st.peek() <= arr[i])
                    st.pop();
                if (st.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = max;
                st.push(arr[i]);
            }

            for (int i = 0; i < num; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
