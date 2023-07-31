import java.util.*;
class Main{
    public static boolean myFun(int [] arr, int x){
     int st = 0, ed = arr.length-1;
     while(st<=ed){
         int mid = (st + ed)/2;
         if(arr[mid] == x){
             return true;
         }else if(arr[mid]<x){
             st = mid + 1;
         }else{
             ed = mid - 1;
         }
      }
      return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i<q; i++){
            int x = sc.nextInt();
            
            if(myFun(arr, x)){
                System.out.println("YES");
            }else{
                   System.out.println("NO");
            }
        }
    }
}
