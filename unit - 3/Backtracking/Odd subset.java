import java.util.*;
class Main{
    
    static int myFun(int [] arr){
        int count  = 0;
        for(int i = 0; i < (1 << arr.length); i++){
            int sum = 0;
            
            for(int j = 0; j<arr.length; j++){
                if((i & (1<<j)) != 0){
                    sum += arr[j];
                }
            }
            if(sum % 2 != 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        int ans = myFun(arr);
        System.out.println(ans);
    }
}
