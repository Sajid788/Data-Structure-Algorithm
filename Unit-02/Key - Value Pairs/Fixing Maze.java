import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] maze = new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = sc.next();
                for (int j = 0; j < m; j++) {
                    maze[i][j] = line.charAt(j);
                }
            }
            int count = 0;
            for (int j = 0; j < m - 1; j++) {
                if (maze[n-1][j] == 'D') {
                    count++;
                }
            }
            for (int i = 0; i < n - 1; i++) {
                if (maze[i][m-1] == 'R') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
