import java.util.*;
class Main{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            for(int k = 0; k<t; k++){
               int n = scn.nextInt();
               int m = scn.nextInt();
               int [][]arr=new int [n][m];
               for(int i = 0; i<n; i++){
                   for(int j =0; j<m; j++){
                       arr[i][j]=scn.nextInt();
                       System.out.print(arr[i][j]+1 +" ");
                   }
                   System.out.println();
               }
            }
        }
    }
    
