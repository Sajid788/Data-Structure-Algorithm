import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][]arr = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int c1=0,c2=0,c3=0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n;j++){
                if(j==0 && i<n/2){
                    c1 += arr[i][j];
                }else if(i == n/2){
                    c2 +=arr[i][j];
                }else if(j==n-1 && i>=n/2){
                    c3 += arr[i][j];
                }
            }
        }
        int result = 3*c1 + c2 + 2*c3;
        System.out.println(result);
    }
}
