import java.util.*;
class Main{
    public static void reverseArray(int [] arr, int i){
        if(i<0){
          return;
         
        }
         System.out.println(arr[i]+" ");
          reverseArray(arr, i-1);
    }
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []  arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         reverseArray(arr, n-1); 
    }
}
