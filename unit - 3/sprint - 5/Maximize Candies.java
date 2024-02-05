import java.util.*;
class Main{
    static int maxCandies;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int bob_i = sc.nextInt();
        int bob_j = sc.nextInt();

        int shop_i = sc.nextInt();
        int shop_j = sc.nextInt();
        maxCandies = 0;
        boolean[][] visited = new boolean[N][M];
        myFun(arr, visited, bob_i, bob_j, shop_i, shop_j, 0);
        if (maxCandies == 0) {
            System.out.println("-1");
        } else {
            System.out.println(maxCandies);
        }
    }
     static void myFun(int[][] arr, boolean[][] visit, int i, int j, int shop_i, int shop_j, int candies){
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || visit[i][j] || arr[i][j] == 0){
            return;
        }
        visit[i][j] = true;
        if (i == shop_i && j == shop_j) {
            maxCandies = Math.max(maxCandies, candies);
        }
        myFun(arr, visit, i - 1, j, shop_i, shop_j, candies + arr[i][j]);
        myFun(arr, visit, i + 1, j, shop_i, shop_j, candies + arr[i][j]);
        myFun(arr, visit, i, j - 1, shop_i, shop_j, candies + arr[i][j]);
        myFun(arr, visit, i, j + 1, shop_i, shop_j, candies + arr[i][j]);
        visit[i][j] = false;
    }
}
