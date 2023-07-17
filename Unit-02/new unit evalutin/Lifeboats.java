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
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int left = 0;
            int right = n-1;
            int count = 0;
            while(left<=right){
                if(arr[left] + arr[right] <= k){
                   left++;
                   right--;
                }else{
                    right--;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
