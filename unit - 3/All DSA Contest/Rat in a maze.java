import java.util.*;

public class Main {

     static int N;
    static int[][] maze;
    static boolean[][] visited;
    static List<String> paths = new ArrayList<>();

    static boolean safe(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1 && !visited[x][y];
    }

    static void myFun(int x, int y, String path) {
        if (x == N - 1 && y == N - 1) {
            paths.add(path);
            return;
        }

        visited[x][y] = true;

        if (safe(x - 1, y)) {
            myFun(x - 1, y, path + "U");
        }
        if (safe(x + 1, y)) {
            myFun(x + 1, y, path + "D");
        }
        if (safe(x, y - 1)) {
            myFun(x, y - 1, path + "L");
        }
        if (safe(x, y + 1)) {
            myFun(x, y + 1, path + "R");
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
        myFun(0, 0, "");
        
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
