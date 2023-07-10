import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr1 = new int[N];
            int[] arr2 = new int[N];

            String[] arr1Str = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(arr1Str[i]);
            }

            String[] arr2Str = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                arr2[i] = Integer.parseInt(arr2Str[i]);
            }

            Stack<Integer> stack = new Stack<>();
            int Index = 0;

            for (int i = 0; i < N; i++) {
                stack.push(arr1[i]);

                while (!stack.isEmpty() && stack.peek() == arr2[Index]) {
                    stack.pop();
                    Index++;
                }
            }

            if (Index == N) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
