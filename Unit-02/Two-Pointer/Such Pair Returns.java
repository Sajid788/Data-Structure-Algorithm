import java.util.*;
import java.io.*;

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr); 

            int left = 0;
            int right = n - 1;
            boolean found = false;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == k) {
                    found = true;
                    break;
                } else if (sum < k) {
                    left++; 
                } else {
                    right--; 
                }
            }

            if (found) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
        }
    }
}
