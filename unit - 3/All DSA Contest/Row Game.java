import java.util.*;

public class Main {

    public static int distinct(int[][] matrix, int n, int m) {
        Set<Integer> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.add(matrix[i][j]);
            }
        }
        int count = 0;
        for (int element : map) {
            boolean row = true;
            for (int i = 0; i < n; i++) {
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == element) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    row = false;
                    break;
                }
            }
            if (row) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int result = distinct(matrix, n, m);
            System.out.println(result);
        }
    }
}
