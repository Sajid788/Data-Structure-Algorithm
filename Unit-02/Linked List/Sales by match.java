import java.util.*;
class Main{
    public static void main(String [] agrs){
        Scanner  sc =  new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for(int  i = 0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                count++;
                i++;
            }
            
        }
        System.out.print (count);
    }
}
