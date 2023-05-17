import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[z];
        for ( int i = 0; i < z; i++){
        arr[i] = sc.nextInt();}
        int mx = 0, sum = 0;
        for ( int i = 0; i < t; i++){
        sum = sum + arr[i];}
          mx = Math.max(mx, sum);
        for( int i = t;  i < z; i++){
            sum = sum + arr[i];
            sum = sum - arr[i-t];
            mx = Math.max(mx, sum);
              }
        System.out.println(mx);
      }
  }
