import java.util.*;
public class Main{
public static int myFun(int left, int right, int turn, int arr[], int dp[][][]) {
    if(left > right) { 
        return 0; 
        }
        if(left == right) {
            if(turn == 1) 
            return arr[left]; 
            return 0; 
            }
            if(dp[left][right][turn] != -1) 
            return dp[left][right][turn]; 
            if(turn == 1) {
                int takeLeft = arr[left] + myFun(left + 1, right, 1 - turn, arr, dp); 
                int takeRight = arr[right] + myFun(left, right - 1, 1 - turn, arr, dp); 
                return dp[left][right][turn]  = Math.max(takeLeft, takeRight); 
            }else{
            int takeLeft = myFun(left + 1, right, 1 - turn, arr, dp); 
            int takeRight = myFun(left, right - 1, 1 - turn, arr, dp); 
            return dp[left][right][turn] = Math.min(takeLeft, takeRight);
        }
    }
        public static void main( String args[]) { 
         Scanner sc = new Scanner(System.in); 
           int n  = sc.nextInt(); 
            int arr[] = new int[n]; 
             int sum = 0; 
           for (int i = 0; i < n; i++) { 
           arr[i] = sc.nextInt(); 
              sum += arr[i]; 
            } 
         int dp[][][] = new int[n][n][2]; 
         for (int i = 0; i < n; i++) { 
          for (int j = 0; j < n; j++) { 
           for (int k = 0; k < 2; k++) { 
            dp[i][j][k] = -1; 
         }
       } 
     }
        int find = myFun (0, n - 1, 1, arr, dp); 
         System.out.println(find + " " + (sum - find));
           }
      }
