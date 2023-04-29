import java.util.*;
class Main{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       for(int i = 0; i<a; i++){
           int n = sc.nextInt();
           int [][]arr = new int [n][n];
           
           for(int j = 0; j<n; j++){
               for(int k = 0; k<n; k++){
                   arr[j][k] = sc.nextInt();
               }
           }
           for(int j = n -1;j>=0;j--){
               System.out.print(arr[j][0]+" ");
           }
           for(int k = 1; k<n;k++){
              for(int l = 1; l<n; l++ ){
                   if(k==l){
                 System.out.print(arr[k][l]+" ");
                   }
               }
           }
           for(int m=n-2; m>=0;m--){
             System.out.print(arr[m][n-1]+" ");  
           }System.out.println();
       }
    }  
}
