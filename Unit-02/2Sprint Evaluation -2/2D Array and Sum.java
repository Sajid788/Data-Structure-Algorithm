import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int s = sc.nextInt();
        int [] [] matrix = new int [N][M];
        for(int i = 0; i<N; i++){
        for (int j = 0; j<M; j++){
           matrix[i][j] = sc.nextInt();
        }
        
        }
        int count = 0;
    for(int i = 0; i < N; i++) {
    for(int j = 0; j < M; j++) {
    if(j+2<M) {
    if(matrix[i][j]+matrix[i][j+1]+ matrix[i][j+2]==s){
                   count++;
           }
       }
          if( i+2<N ){
        if( matrix[i][j] + matrix[i+1][j] + matrix[i+2][j]==s){
               count++;
             }
          }
          if(i+2< N && j+2 < M){
        if (matrix[i][j] + matrix[i+1][j+1] + matrix[i+2][j+2]==s){
               count++;
               }
         }
         if(i-2>=0&&j+2<M){
           if (matrix[i][j] + matrix[i-1][j+1] + matrix[i-2][j+2]==s){
               count++;
           }
         }
       }
     }
 System.out.println(count);
}
}
