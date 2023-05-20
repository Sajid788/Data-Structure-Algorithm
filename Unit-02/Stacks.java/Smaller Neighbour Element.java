import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int [] arr = new int [num];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<num;i++){
            while(!st.empty() && st.peek() >=arr[i]){
                st.pop();
            }
            if(st.empty()){
                System.out.print("-1"+" ");
            }else{
               System.out.print(st.peek() +" ");  
            }
            st.push(arr[i]);
        }
    }
}
