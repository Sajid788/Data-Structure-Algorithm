import java.util.*;
class Main{
    
    public static int myFun(int [] arr, int st, int ed,  int k){
        // int st = 0, ed = n-1;
        while(ed>=st){
            int mid  = (st + ed)/2;
            if(arr[mid] == k){
                return 1;
            }else if(arr[mid]<k){
                return myFun(arr, mid + 1, ed, k);
            }else{
                return myFun(arr, st ,mid-1, k);
            }
        }
        return  -1;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       
        System.out.println(myFun(arr, 0, n-1, k));
    }
}
