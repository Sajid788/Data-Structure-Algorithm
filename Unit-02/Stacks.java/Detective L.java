import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int l = 0; l<t; l++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            int arr [][] = new int [row] [col];
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    arr [i] [j] = sc.nextInt();
                }
            }
            int mr = 0;
            int mc = 0;
            int mxr = arr.length-1;
            int mxc = arr[0].length-1;
            int tl = row*col;
            int count = 0;
            while(count<tl){
                for(int i = mr,j=mc;i<=mxr;i++){
                    System.out.print(arr[i][j]+" ");
                      count++;
                }
                  mc++;
                  for(int i =mxr,j=mc;j<=mxc;j++){
               System.out.print(arr[i][j]+" ");
               count++;
               }
              mxr--;
            }
            System.out.println();
        }
    }
}
