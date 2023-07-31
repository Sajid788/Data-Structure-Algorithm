import java.util.*;
 class Main{
     public static int myFun ( int[] arr){
         int low = 0, high = arr.length-1 ;
         while( low <= high){
             int mid = low + ( high-low)/2;
              if (arr[mid] < arr[high]){
                high = mid;
              }
           else if (arr[mid] > arr[high]){
                 low = mid +1;
             }
             else{
                 high = mid - 1;
             }
         }return low;
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int [n]; 
         for ( int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             int mid = myFun(arr);
             if ( mid== arr.length-1)
             System.out.println(arr[0]);
            else System.out.println(arr[mid]);
           
         }
     }

