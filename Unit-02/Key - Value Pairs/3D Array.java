import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int [][][]arr = new int [n][m][k];
        for(int i = 0; i<n; i++){
        for(int j =0; j<m; j++){
            for(int t = 0; t<k; t++){
               arr[i][j][t] = sc.nextInt();
                 System.out.print(arr[i][j][t]+ " ");
             }
             System.out.println();
         }  
       }
    }
}
