import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char [][] arr = new char[n][n];
            for(int i = 0; i<n; i++){
            String s = sc.next();
            for(int j =0; j<n; j++){
                arr[i][j] = s.charAt(j);
            }
        }
       int i =0; 
       int j =0; 
       int ct =0;
       while(i>=0 && i<n && j<n && j>=0){
           if(arr[i][j] == 'R'){
               j++;
           }else if(arr[i][j]=='L'){
               j--;
           }else if(arr[i][j]=='D'){
               i++;
           }else if(arr[i][j]=='U'){
               i--;
           }
           ct++;
           if(ct>n*n){
               ct = 0; 
               break;
           }
       }
       System.out.println(ct);
    }
  }
}
