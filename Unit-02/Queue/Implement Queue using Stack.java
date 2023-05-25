import java.util.*;
class Solution{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void add(int data){
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
         stack1.push(data);
        
        while(!stack2.empty()){
            stack1.push(stack2.pop());
            
        }
    }
    public int remove(){
        return stack1.pop();
        }
        
    public int front(){
        
      return stack1.peek();
    }
}
