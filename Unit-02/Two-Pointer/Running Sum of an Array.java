import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1; j<=t; j++){
        int n = sc.nextInt();
        int [] arr = new int [n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            System.out.print(sum +" ");
        }
        System.out.println();
    }
  }
} 
