import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int [n];
            for(int i = 0; i<n; i++){
                arr [i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int result = Integer.MAX_VALUE;
            for(int i = 0; i<n; i++){
                if(i + k<=n){
                    for(int a = 0;a<i+k; a++){
                        int sum = 0;
                        for(int j = i; j<i+k; j++){
                            int ans = arr[a] - arr[j];
                            if(ans>=0){
                            sum = sum + ans * 3;
                            }else{
                                sum = sum + Math.abs(ans*5);
                            }
                        }
                        result = Math.min(result, sum);
                    }
                }else{
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
