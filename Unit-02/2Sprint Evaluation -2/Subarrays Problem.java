import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0; 
        int j = 0;
        long sum = 0;
        long count = 0;
        long even = 0;
        long odd  = 0;
        
        while(j<n){
            sum = sum + arr[j];
            if(sum%2 == 0){
                even++;
                count=count+even;
            }else{
                count=count+odd;
                odd++;
            }
            j++;
        }
        System.out.println(count);
    }
}
