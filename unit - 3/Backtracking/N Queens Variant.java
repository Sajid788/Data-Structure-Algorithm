import java.util.*;
class Main {
    static int ans = 0;
    static boolean safe(int[][] board, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (board[i][m] == 1) {
                return false;
            }
        }
        for (int i = n - 1, j = m - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = n - 1, j = m + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
    public static void myFun(int[][] board, int row) {
        if (row == board.length) {
            ans++;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (safe(board, row, i)) {
                board[row][i] = 1;
                myFun(board, row + 1);
                board[row][i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        myFun(board, 0);
        System.out.println(ans);
    }
}
