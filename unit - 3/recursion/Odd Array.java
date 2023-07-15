import java.util.*;
class Main{
    public static void oddArray(int [] arr, int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]%2==1){
            System.out.println(arr[i]);
        }
        oddArray(arr, i+1);
    }
    
    public static void main(String [] args){
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int [] arr = new int [n];
      for(int i = 0; i<n; i++){
          arr[i] = sc.nextInt();
      }
      oddArray(arr,0);
    }
}
