import java.util.*;
class Main{
    public static long myFun(int [] arr){
        long result = 0;
        int min = arr[0];
        int ind = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                int temp = i-ind;
                result += (min*temp);
                ind = i;
                min = arr[i];
            }
        }
        result += (min*(arr.length-ind));
        return result;
    }
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(myFun(arr));
    }
}
