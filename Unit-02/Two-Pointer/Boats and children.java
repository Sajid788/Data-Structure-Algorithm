import java.util.*;
class Main{
    static int myFun(int [] arr, int n){
        Arrays.sort(arr);
        int boats = 0;
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            if(arr[l] + arr [r] <= n){
                l++;
            }
            r--;
            boats++;
        }
        return boats;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr  = new int [n];
        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        int result  = myFun(arr, m);
        System.out.println (result);
    }
}
