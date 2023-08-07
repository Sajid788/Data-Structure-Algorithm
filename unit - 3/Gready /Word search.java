import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        String str = sc.next();
        boolean ans = find(arr, str);
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean find(char[][] arr, String str) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == str.charAt(0) && ans(arr, str, i, j, 0, new boolean[row][col])) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean ans(char[][] arr, String str, int row, int col, int index, boolean[][] visited) {
        if (index == str.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || visited[row][col] || arr[row][col] != str.charAt(index)) {
            return false;
        }
        visited[row][col] = true;
        boolean find = ans(arr, str, row + 1, col, index + 1, visited) ||
                       ans(arr, str, row - 1, col, index + 1, visited) ||
                       ans(arr, str, row, col + 1, index + 1, visited) ||
                       ans(arr, str, row, col - 1, index + 1, visited);
        visited[row][col] = false; 
        return find;
    }
}
