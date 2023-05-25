import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Queue<Integer> club1 = new LinkedList<>();
        Queue<Integer> club2 = new LinkedList<>();
        Queue<Integer> club3 = new LinkedList<>();
        Queue<Integer> club4 = new LinkedList<>();
        Queue<Integer> allQueue = new LinkedList<>();
        for(int i =0; i<num;i++){
            char X = sc.next().charAt(0);
            if(X == 'E'){
                int C = sc.nextInt();
                int R = sc.nextInt();
                if(allQueue.isEmpty()|| !allQueue.contains(C)) allQueue.add(C);
                if(C==1)club1.add(R);
                else if( C == 2) club2.add(R);
                 else if( C == 3) club3.add(R);
                 
                 else{
                     club4.add(R);
                 }
                
            }else{
                if(allQueue.peek() == 1){
                    System.out.println(1 + " " + club1.remove());
                    if(club1.isEmpty()) allQueue.remove();
                }else if(allQueue.peek() == 2){
                     System.out.println(2 + " " + club2.remove());
                     if(club2.isEmpty()) allQueue.remove();
                }else if (allQueue.peek() == 3){
                   System.out.println(3 + " " + club3.remove());  
                   if(club3.isEmpty()) allQueue.remove();
                }else{
                     System.out.println(4 + " " + club4.remove());
                     if(club4.isEmpty()) allQueue.remove();
                }
            }
        }
    }
}
