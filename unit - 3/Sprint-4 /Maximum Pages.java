import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int cost [] = new int [n];
        for(int i = 0; i<n; i++){
            cost [i] = sc.nextInt();
        }
        int  page []  = new int [n];
        for(int i = 0; i<n; i++){
            page [i] = sc.nextInt();
          }
          int result = myFun(cost,page,n,x);
          System.out.print(result);
        }
        static int myFun(int cost [], int page[], int n, int x){
            int arr[][] = new int [n+1][x+1];
            for(int i = 0; i<=n; i++){
                for(int j = 0; j<=x; j++){
                    if(i==0||j==0){
                        arr [i][j] = 0;
                    }
                    else if(cost[i-1]>j)
                    {
                        arr[i][j] = arr[i - 1] [j];
                    }else{
                      arr [i] [j] = Math.max(arr[i-1][j], arr[i-1] [j - cost[i-1]] + page[i-1]); 
                    }
                    
                }
            }
            return arr[n][x];
        }
        
    }
