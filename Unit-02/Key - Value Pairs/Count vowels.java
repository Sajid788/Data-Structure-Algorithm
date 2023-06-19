import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char [][] arr = new char [n][m];
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    arr[i][j] = sc.next().charAt(0);
                }
            }
            if(n==m*2-1){
            int count = 0;
            int i = 0;
            for(int j = m-1; j>=0; j--,i++){
               if(arr[i][j]=='a' || arr[i][j]=='e' || arr[i][j]=='i' || arr[i][j]=='o' || arr[i][j]=='u'){
                   count++;
               }
            }
            for(int j = 1; j<=m-1; j++,i++){
               if(arr[i][j]=='a' || arr[i][j]=='e'|| arr[i][j]=='i' || arr[i][j]=='o' || arr[i][j]=='u'){
                   count++;
               }    
            }
            System.out.println(count);
        }else{
            System.out.println("-1"); 
        }
    }
  }
}
