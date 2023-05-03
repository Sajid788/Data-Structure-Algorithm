import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int oddSum = 0, evenSum = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                evenSum +=arr[i];
            }else{
                oddSum += arr[i];
            }
        }
        if(oddSum>evenSum){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
