import java.util.*;
class Main{
    public static class Pair{
        int key;
        int index;
        
        public Pair(int key, int index){
            this.key=key;
            this.index=index;
        }
        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            int m= sc.nextInt();
        Queue<Pair> q= new LinkedList<>();
        Queue<Pair> temp= new LinkedList<>();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            q.add(new Pair(a,i));
        }
    //   int[] ans= new int[m];
    ArrayList<Integer> list= new ArrayList<>();
      int num=m;
      int index=0;
      while(num-->0){
          int max=Integer.MIN_VALUE;
          int iter=Math.min(m,q.size());
        
          for(int i = 0; i < iter; i++) {
            if(max < q.peek().key) {       //finding max power soldier and keeping its index.
                max = q.peek().key;
                index = q.peek().index;
            }
            temp.add(q.peek());
            q.remove();
        }
        // ans[m-num]=index;
        list.add(index+1);
        
       int flag = 0;
        while(!temp.isEmpty()) {
            if(temp.peek().key == max && flag == 0) {
                temp.remove();
                flag++;                          //if more than one itme in queue is equal to max, we pop only the first max item and move on with the other operations.
            }
            else if(temp.peek().key > 0)
            {
                temp.peek().key -= 1;           //before enqueing again we are decreasing the power of the soldiers.
                q.add(temp.peek());
                temp.remove();
            }
            else                           //this is the condition where soldier's power is already 0, so we don't decrease that and move on with our operations as it is.
            {
                q.add(temp.peek());
                temp.remove();
            }
        }
    }
   
    for(int i=0; i<list.size();i++){
         System.out.print(list.get(i)+" ");
    }
  }
}
