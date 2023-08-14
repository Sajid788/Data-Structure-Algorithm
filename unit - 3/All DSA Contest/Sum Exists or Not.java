import java.util.*;
class Main{ 
    static boolean flag = false;
    public static void myFun(int[] arr,int k, int sum, int cur){
        if (sum == k){
         flag = true;
        }
    if (cur == arr.length){ 
            return ;
    }
    for (int i = cur;i<arr.length;i++){
      myFun(arr, k, sum,i+1); 
      myFun(arr,k, sum + arr[i],i+1);
    }
  }
    public static void main(String[] args){
    Scanner s = new Scanner (System.in); 
    int n = s.nextInt(); 
    int[] arr = new int[n]; 
    for (int i=0;i<n;i++) arr[i] =s.nextInt(); 
    int k = s.nextInt(); 
    myFun(arr,k,0,0); 
    if (flag) System.out.println("yes"); 
    else{
        System.out.println("no");
          }
        }   
    }
