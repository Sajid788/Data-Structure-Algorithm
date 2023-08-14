import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
            Queue<Integer> q = new LinkedList <>();
            for(int i = 0; i<n; i++){
                int query = sc.nextInt();
                 if(query == 1){
                 int k = sc.nextInt();
                    q.add(k);
                }else if(query == 2){
                   if(!q.isEmpty()){
                       count += q.poll();
                   }else{
                       count--;
                   } 
                }
            }
          System.out.println(count);
    }
}
