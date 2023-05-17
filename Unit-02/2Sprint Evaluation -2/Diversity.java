import java.util.*;
class Main{
    public static void main(String []  args){
        Scanner sc  =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int [n];
            for(int  i = 0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int maxFamilies = 0; 
            int i =0,j=0;
            while(j<n){
                if(arr[j] - arr[i] <=k){
                    maxFamilies = Math.max(maxFamilies, j-i+1);
                    j++;
                }else{
                    i++;
                }
            }
            System.out.println(maxFamilies );
        }
    }
}
