import java.util.*;
class Main {
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean solveNQueens(char[][] board, int col) {
        int n = board.length;
        if (col == n) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 'Q';
                if (solveNQueens(board, col + 1)) {
                    return true;
                }
                board[i][col] = '.';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if (solveNQueens(board, 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
