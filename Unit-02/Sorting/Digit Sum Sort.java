import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
         for(int l =0; l<t;l++){
            int n =sc.nextInt();
            int [] arr = new int [n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int [] dgtSum = new int [n];
            for(int i = 0; i<n; i++){
                int num = arr[i];
               int sum = 0;
               while(num>0){
                   int rem = num%10;
                   sum = sum + rem;
                   num = num/10;
               }
               dgtSum [i] = sum;
            }
            for(int i = 0; i<n-1; i++){
                for(int j = 0; j<n-i-1;j++){
                    if(dgtSum[j]>dgtSum[j+1] || dgtSum[j] == dgtSum[j+1] && arr[j]>arr[j+1]){
                        int temp = arr [j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        
                        int ans = dgtSum[j];
                        dgtSum [j] = dgtSum[j+1];
                        dgtSum[j+1] = ans;
                    }
                }
            }
            
            for(int i = 0; i<n; i++){
             System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
