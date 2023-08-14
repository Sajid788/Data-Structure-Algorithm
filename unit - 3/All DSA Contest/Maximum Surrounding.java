import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); 
           int m = sc.nextInt(); 
           int[][] arr = new int[n][m];
            int[][] arr2 = new int[n][m];
           for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
      for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int top = (i - 1 >= 0) ? arr[i - 1][j] : Integer.MIN_VALUE;
                int bottom = (i + 1 < n) ? arr[i + 1][j] : Integer.MIN_VALUE;
                int left = (j - 1 >= 0) ? arr[i][j - 1] : Integer.MIN_VALUE;
                int right = (j + 1 < m) ? arr[i][j + 1] : Integer.MIN_VALUE;

                arr2[i][j] = Math.max(Math.max(Math.max(top, bottom), left), right);
            }
        }


        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                System.out.print(arr2[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}
