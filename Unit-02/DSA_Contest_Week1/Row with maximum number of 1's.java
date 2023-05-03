import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            int ans = 1;
            for (int r = 0; r < n; r++) {
                int count = 0;
                for (int c = 0; c < m; c++) {
                    if (a[r][c] == 1) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    ans = r+1 ;
                }
            }
            System.out.println(ans);
        }
    }
}
