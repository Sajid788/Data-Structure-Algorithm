import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
        }
        int total = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<n; i++){
            int curr = arr[i];
            min = Math.min(min, curr);
            total += min;
        }
        System.out.print(total);
    }
}
