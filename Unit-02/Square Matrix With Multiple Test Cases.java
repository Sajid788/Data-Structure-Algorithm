import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            for(int i = 0; i<n; i++){
            int t = sc.nextInt();
            int [] [] arr = new int [t] [t];
            for (int k = 0; k<t; k++){
                for(int j = 0; j<t; j++){
                    arr [k] [j] = sc.nextInt();
                    System.out.print(arr[k][j]+1 +" ");
                }
                System.out.println();
            }
        }
    }
}
