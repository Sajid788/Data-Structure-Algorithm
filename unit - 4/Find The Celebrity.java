import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt(); 
            int[][] matrix = new int[n][n];
            
           
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            int celebrity = -1;
            for (int i = 0; i < n; i++) {
                boolean isCelebrity = true;
                for (int j = 0; j < n; j++) {
                    if (i != j && (matrix[i][j] == 1 || matrix[j][i] == 0)) {
                        isCelebrity = false;
                        break;
                    }
                }
                if (isCelebrity) {
                    celebrity = i;
                    break;
                }
            }
            
            System.out.println(celebrity);
        }

    }
}
// output 1
