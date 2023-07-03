import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] queue = new int [n];
        for(int i = 0; i<n; i++){
            queue [i] = sc.nextInt();
        }
        int moves = 0;
        for(int i = 0; i<n; i++){
           for(int j = 0; j<n; j++){
               if(arr[i]==queue[j]){
                   moves++;
                   queue[j] = 0;
                   break;
               }else if(queue[j] == 0){
                   continue;
               }
               moves++;
           } 
        }
        System.out.println(moves-1);
    }
}
