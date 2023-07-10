import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer>stack = new Stack<>();
        
        for(int i = 0; i<n;i++){
            int query = sc.nextInt();
            if(query == 1){
                int bookId = sc.nextInt();
                stack.push(bookId);
            }else if(query == 2){
                if(stack.isEmpty()){
                System.out.println("No Books");
                    
                }else{
                  System.out.println(stack.pop());
                }
            }else if(query == 3){
                if(stack.isEmpty()){
                       System.out.println("No Books");
                }else{
                 System.out.println (stack.peek());
                }
            }
        }
    }
}
