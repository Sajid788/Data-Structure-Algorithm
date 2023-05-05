import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            int[] row = new int[n];
            int[] col = new int[m];
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int type = sc.nextInt();
                int index = sc.nextInt();
                if (type == 0) {
                    row[index]++;
                } else {
                    col[index]++;
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = row[i] + col[j];
                    if (arr[i][j] % 2 != 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
