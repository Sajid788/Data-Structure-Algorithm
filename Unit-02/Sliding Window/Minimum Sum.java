import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            
        int n = sc.nextInt();
        
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        
        for ( int i = 0; i<n; i++){
            
        arr[i] = sc.nextInt();
            
        }
        int sum = 0,min = 1000000;
        
        for ( int i = 0; i < k; i++){
            
         sum = sum + arr[i];
            
        }
         min = Math.min(min, sum);
         
        for( int i = k;  i < n; i++){
            
            sum = sum +arr[i];
            
            sum = sum - arr[i-k];
            
            min = Math.min(min, sum);
              }
        System.out.println(min);
      }
    }
}
