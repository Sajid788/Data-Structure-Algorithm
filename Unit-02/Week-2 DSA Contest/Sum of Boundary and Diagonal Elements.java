import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] [] arr = new int [n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        
        for(int i = 0; i<n; i++){
            for(int j =0; j<n;j++){
                if(i == 0 || i == n-1 || j == 0 || j == n-1 || i==j || i==n-1-j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
