import java.util.*;
  public class Main{ 
      public static void main(String args[]){ 
          Scanner sc = new Scanner(System.in); 
          int t=sc.nextInt(); 
          for (int i=1;i<=t;i++){ 
              int h=sc.nextInt(); 
              int w=sc.nextInt(); 
              int mat[][]=new int[h][w]; 
              for (int j=0;j<h;j++){ 
              for (int k=0;k<w;k++){ 
              mat[j][k]=sc.nextInt(); 
                }
              }
             int dp[][]=new int[h][w]; 
             int max=0; 
             for (int j=0;j<w;j++){ 
             max=Math.max(max, myFun(0,j,mat, dp));
             }
             System.out.println(max); 
          }
      }
     public static int myFun(int i,int j, int mat[][],int dp[][]){ 
         if(i>=mat.length || j<0 || j>=mat[0].length) {
             return 0;
             }
             int inc=0, ex=0; 
             if(dp[i][j]!=0)
             return dp[i][j];
             inc = mat[i][j] + Math.max(myFun(i+1,j,mat,dp),
             Math.max(myFun(i+1,j+1,mat,dp),
             myFun(i+1,j-1,mat,dp)));
             return dp[i][j] = inc;
     }
  }
