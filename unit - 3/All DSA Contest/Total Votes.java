import java.util.*;
 
 public class Main {
      public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         for(int i=0; i<t; i++){
             int x = sc.nextInt();
             int y = sc.nextInt();
             int z = sc.nextInt();
              String result = myFun(x, y, z);
             System.out.println(result);
         }
     }
     public static String myFun(int x, int y, int z) {
        int Upvote = x + z;
        int Downvote = y;
         String ans = solve(Upvote, Downvote);
         int Up = x;
        int Down = y + z;
         String ans2 = solve(Up, Down);
         boolean is = false;
         String finalAns= "";
         for (int p = 0; p <= z; p++){
            int Upvote2 = x + p;
            int Downvote2 = y + (z - p);
            String curr = solve(Upvote2, Downvote2);
            if (!curr.equals(ans) || !curr.equals(ans2)){
                is = true;
                break;
                } 
            else{
                finalAns = curr;
            }
        }

        if (is){
            return "?";
        } 
        else{
            return finalAns;
        }
    }
    
    private static String solve(int upvotes, int downvotes) {
        
        if (upvotes > downvotes){
            return "+";
        }
        else if(upvotes < downvotes) {
            return "-";
        }
        else {
            return "0";
        }
    }
 }
