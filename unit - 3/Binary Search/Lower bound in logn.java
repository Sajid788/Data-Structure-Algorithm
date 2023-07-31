import java.util.*;
class Main{
    public static int myFun(int [] arr, int k){
        int st = 0, ed = arr.length - 1;
        int ans = -1;
        while(st<=ed){
            int mid = (st + ed)/2;
            if(arr[mid] == k){
                ans = mid;
                ed = mid - 1;
            }else if(arr[mid]<k){
               st = mid + 1; 
            }else {
                ed = mid - 1;
            }
        }
        return ans;
    }
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
          
        }
          System .out.println(myFun(arr,k));
    }
}
