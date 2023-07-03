import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n - 1]);
        int maxMark = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxMark) {
                stack.push(arr[i]);
                maxMark = arr[i];
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
