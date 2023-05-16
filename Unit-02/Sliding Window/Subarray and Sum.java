import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int k = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();}
        int mxln = 0, count = 0, flag = 0;
       for (int i = 0; i < N; i++){
            int sum = 0;
            for (int j = i; j<N; j++) {
                sum = sum + A[j];
            if (sum % k != 0) {
                int len = j-i+1;
                if(len == N){
                    flag = 1;
                    count = 1;
                    break;}
               if (len > mxln){
                   mxln = len;
                   count = 1;
               }else if ( len == mxln){
                   count +=1;
                       }
                    }
                 }
                   if ( flag == 1){
                       break;
                   }
               }
                System.out.println(count);
            }
        }
