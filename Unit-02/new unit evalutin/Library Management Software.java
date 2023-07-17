import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        Stack<Integer> stk = new Stack<>();
          int m = sc.nextInt();
          for(int i = 0; i<m; i++){
              int num = sc.nextInt();
              if(num==1){
                  stk.push(sc.nextInt());
              }
              else if(num==2){
                  if(!stk.empty()){
                      System.out.println(stk.peek());
                      stk.pop();
                  }
                  else{
                      System.out.println("No Books");
                  }
              }
              else if(num==3){
                  if(!stk.empty()){
                      System.out.println(stk.peek());
                  }
                  else{
                      System.out.println("No Books");
                  }
              }
          }
    }
}
