import java.util.*;
class Main{
   public static void main(String args [] )  {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int act[] = new int [n];
       for ( int i = 0; i < n ; i++){
           act[i] = sc.nextInt();
       }
       int ideal [] = new int[n];
       for (int i = 0; i<n; i++){
           ideal[i] = sc.nextInt();
       }
       int cost = 0;
       Queue < Integer > q = new LinkedList<>();
       for ( int i : act){
           q.add(i);
       }
       for (int i = 0; i<n;i++){
           if( q.peek() != ideal[i]){
               int temp = q.remove();
               q.add(temp);
               i--;
           }else{
               q.remove();}
           cost++;
       }
       System.out.println(cost);
   }  
}
