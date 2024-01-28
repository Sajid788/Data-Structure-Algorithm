import java.util.*;
class Main{
    
    static boolean result (int [][] arr, int k,int l, int i){
        for(int j = 0; j<9; j++){
            if(arr[k][j] == i)
                return false;
            }
            for(int j = 0; j<9; j++){
                if(arr[j][l] == i)
                    return false;
                }
                int row = k - (k % 3), col = l - (l % 3);
                for(int j = row; j<row + 3; j++){
                    for(int m = col; m <col + 3; m++){
                        if(arr[j][m] == i)
                        return false;
                }
            }
            return true;
       }
       
       static boolean myFun(int [][] arr){
           int k = -1, l = -1, empty = 0;
           for(int i = 0; i<9; i++){
               for(int j = 0; j<9; j++){
                   if(arr [i] [j]  == 0){
                       k = i;
                       l = j;
                       empty = 1;
                       break;
                   }
               }
               if(empty == 1)
               break;
           }
           if(empty == 0)
           return true;
           for(int i = 0; i<=9; i++){
               if(result(arr, k, l, i)){
                   arr[k][l] = i;
                   if(myFun(arr))
                   return true;
                   else
                   arr[k][l] = 0;
               }
           }
           return false;
       }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [9] [9];
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                arr [i] [j] = sc.nextInt();
            }
        }
        if(myFun(arr)){
            for(int i = 0; i<9; i++){
                for(int j = 0; j<9; j++){
                    System.out.print(arr [i] [j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println(-1);
        }
    }
}
