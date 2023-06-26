import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n-k+1; i++){
            int white = 0;
            for(int j = i; j<i+k; j++){
                if(str.charAt(j)=='W'){
                    white++;
                }
            }
            if(white<min){
                  min = white;
                }
            }
            System.out.println(min);
        }
    }
}
