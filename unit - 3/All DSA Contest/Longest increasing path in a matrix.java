import java.util.*;

public class Main {
    public static int myFun(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        
        int maxLength = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxLength = Math.max(maxLength, dfs(matrix, dp, i, j, Integer.MIN_VALUE));
            }
        }
        
        return maxLength;
    }
    
    private static int dfs(int[][] matrix, int[][] dp, int i, int j, int prevValue) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] <= prevValue) {
            return 0;
        }
        
        if (dp[i][j] > 0) {
            return dp[i][j];
        }
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int maxPath = 0;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            maxPath = Math.max(maxPath, dfs(matrix, dp, x, y, matrix[i][j]));
        }
        
        dp[i][j] = maxPath + 1 ;
        return dp[i][j];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int result = myFun(matrix);
        System.out.println(result);
    }
}
