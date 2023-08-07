import java.util.*;
class Main{
    public static int myFun(int [] arr){
        int low = 0, high = arr.length-1;
        while( low <= high){
            int mid = low +(high-low)/2;
            if (arr[mid] < arr [high]) high = mid;
            else if ( arr [mid] > arr[high] )low= mid +1;
            else { 
                high --;
        }
    }
    return low ;
}
public static boolean check( int[] arr, int low, int high){
    for( int i = low; i<= high-1; i++){
        if (arr[i] > arr [i+1]) 
        return false;
    }
    return arr [high] < arr[low] ? false : true;
}
public static void main (String [] args){
    Scanner sc = new Scanner ( System.in);
    int n = sc.nextInt();
    int [] arr = new int [n];
    for ( int i = 0; i< arr.length; i++) 
    arr[i] = sc.nextInt();
    int index = myFun (arr);
    if ( index == 0) System.out.println("NO");
    else{
        if (check(arr, 0 ,index-1) && check(arr,index,arr.length-1)) 
        System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
  }
}
