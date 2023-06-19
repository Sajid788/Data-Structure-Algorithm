import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int  i= 0; i<n; i++){
           arr[i] = sc.nextInt(); 
        }
        int maxCount = 0;
        int currNum = 0;
        int prevNum = -1;
        for(int  i = 0; i<n; i++){
           if(arr[i]%2==1){
               if(arr[i]==prevNum){
                   currNum++;
               }else{
                   currNum = 1;
               }
               prevNum = arr[i];
               maxCount = Math.max(maxCount,currNum);
           }else{
               currNum =0;
               prevNum = -1;
           }
               
        }
        System.out.println(maxCount);
    }
}
