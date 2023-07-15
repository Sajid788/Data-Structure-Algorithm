import java.util.*;
class Main{
    public static void evenArray(int [] arr, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]%2==0){
            System.out.println(arr[i]);
           
        }
         evenArray(arr, i+1);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        evenArray(arr, 0);
    }
}
