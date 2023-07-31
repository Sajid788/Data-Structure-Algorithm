import java.util.*;
class Main{
    public static int myFun(int [] arr, int n, int k){
          int st = 0, end = n-1;
          while(st<=end){
              int mid = (st + end)/2;
              if(arr[mid]==k){
                  return 1;
              }else if(arr[mid]<st){
                  st = mid + 1;
              }else{
                  end = mid - 1;
              }
          }
          return -1;
    }
    
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int k = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(myFun(arr, n, k));
    }
}
