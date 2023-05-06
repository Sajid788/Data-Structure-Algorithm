import java.util.*;
class Main{
    public static void main(String agrs[]){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int  k =sc.nextInt();
            long arr[] = new long[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            long sarr[] = new long [n];
            k = k%n;
            for(int  i = 0; i<n;i++){
               sarr[k] = arr[i];
               k = (k+1)%n;
            }
            for(int i = 0; i<n; i++){
                System.out.print(sarr[i]+" ");
            }
            System.out.println();
        }
    }
}
