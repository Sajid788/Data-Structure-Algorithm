
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc  =  new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i <n; i++){
           if (arr[i]%2==1){
                  }else{
                 int subCount = 0;
                 for(int j = i+1; j<n; j++){
                     if(arr[j]%2==1){
                         subCount++;
                         count++;
                 }
              }
           }
        }
        System.out.println(count);
    }    
  }
}
