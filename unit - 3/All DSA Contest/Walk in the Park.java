import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) { 
            String[] size = sc.nextLine().split(" ");
            int N = Integer.parseInt(size[0]);
            int M = Integer.parseInt(size[1]);

            char[][] arr = new char[N][M];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextLine().toCharArray();
            }

            myFun(N, M, arr);
        }
    }

    public static void myFun(int N, int M, char[][] arr) {
        int i = 0, j = 0;
        int count = 0;
        int max = 1;

        while (i >= 0 && i < N && j >= 0 && j < M && max <= N * M) {
            if (arr[i][j] == 'R') {
                arr[i][j] = '0';
                j++;
                count++;
            } else if (arr[i][j] == 'L') {
                arr[i][j] = '0';
                j--;
                count++;
            } else if (arr[i][j] == 'U') {
                arr[i][j] = '0';
                i--;
                count++;
            } else if (arr[i][j] == 'D') {
                arr[i][j] = '0';
                i++;
                count++;
            } else if (arr[i][j] == '0') {
                break;
            }
            max++;
        }

        if (i == N || j == M || i < 0 || j < 0) {
            System.out.println(count);
        } else {
            System.out.println(count);
        }
    }
}
