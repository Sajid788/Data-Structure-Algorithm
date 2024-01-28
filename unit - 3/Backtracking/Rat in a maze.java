import java.util.*;
public class Main {
    static int N;
    static int[][] maze;
    static boolean[][] visited;
    static ArrayList<String> paths = new ArrayList<>();
    static boolean isSafe(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1 && !visited[x][y];
    }
    static void DFS(int x, int y, String path) {
        if (x == N - 1 && y == N - 1) {
            paths.add(path);
            return;
        }
        visited[x][y] = true;

        if (isSafe(x - 1, y)) {
            DFS(x - 1, y, path + "U");
        }
        if (isSafe(x + 1, y)) {
            DFS(x + 1, y, path + "D");
        }
        if (isSafe(x, y - 1)) {
            DFS(x, y - 1, path + "L");
        }
        if (isSafe(x, y + 1)) {
            DFS(x, y + 1, path + "R");
        }
        visited[x][y] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        maze = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        if(maze[0][0]==0){
            System.out.println(-1);
        }else{
        DFS(0, 0, "");
        
           if (paths.size() == 0) {
            System.out.println("-1");
        } else {
            Collections.sort(paths);
            for (String path : paths) {
                System.out.print(path+" ");
            }
          }
        }
    }
}
