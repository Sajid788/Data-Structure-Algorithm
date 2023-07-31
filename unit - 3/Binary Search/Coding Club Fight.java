import java.util.*;
class Main{
    public static int solve(int [] arr, int k){
      int low = 0 , high = arr.length -1, ans = arr.length;
      while(low<=high){
          int mid = low + (high - low)/2;
          if(arr[mid]>k){
              ans = mid;
              high = mid - 1;
          }else{
              low = mid + 1;
          }
      }
      return ans;
    }
    
    public static int sum (int [] arr , int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
    
     public static void main(String [] args){
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int [] arr = new int [n];
       for(int i = 0; i<n; i++)
           arr [i] = sc.nextInt();
           Arrays.sort(arr);
           int sum = 0;
           int q = sc.nextInt();
           for(int i = 0; i<q; i++){
               int x = sc.nextInt();
               int index = solve(arr,x);
               sum = sum (arr,index);
               System.out.println(index+" "+ sum);
           }
       }
   }
