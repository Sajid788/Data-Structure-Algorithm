import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[]arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int largestOdd = Integer.MIN_VALUE;
            int smallestEven = Integer.MAX_VALUE;
            for(int i = 0; i<n; i++){
                if(arr[i]%2==0 && arr[i] < smallestEven){
                    smallestEven = arr[i];
                }
                if(arr[i]%2 !=0 && arr[i] > largestOdd){
                    largestOdd = arr [i];
                }
            }
            int difference = largestOdd - smallestEven;
            System.out.println(difference);
        }
    }
}
