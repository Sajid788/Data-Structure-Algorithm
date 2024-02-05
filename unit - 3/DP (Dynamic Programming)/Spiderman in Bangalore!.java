import java.util.*; 
class Main{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        int k = sc.nextInt(); 
        int[] arr = new int[size]; 
        for(int i=0; i < size; i++){ 
          arr[i]=sc.nextInt(); 
        }
        int []dp = new int[arr.length]; 
        int a = myFun(arr,k, arr.length-1,dp); 
        System.out.println(a); 
       }
        public static int myFun(int[] arr,int k, int size,int[] dp){ 
        if(size==0){ 
            return 0; 
        }
            if(dp[size]!=0){
                return dp[size];
            }
        int mini=99999; 
        for(int i=1;i<=k;i++){ 
            if(size>=i){
     mini=Math.min(myFun(arr,k,size-i,dp)+Math.abs(arr[size]-arr[size-i]),mini);
            }
    dp[size]=mini;
        }
    return dp[size];
      }
  }
