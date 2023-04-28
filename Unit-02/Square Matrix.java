import java.util.*;

class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] sqr = new int [n] [n];
        
        for(int i =0; i<n;i++){
            for(int j=0; j<n;j++){
                sqr [i] [j]= sc.nextInt()+1;
                System.out.print(sqr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
