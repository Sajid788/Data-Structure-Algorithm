import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0;  i<n; i++){
            int  k = sc.nextInt();
            if(k == 1){
                int t = sc.nextInt();
                st.push(t);
            }else if(k==2){
                if(!st.empty()){
                    st.pop();
                }
            }else{
                if(st.empty()){
                    System.out.println("Empty!");
                }else{
                     System.out.println(st.peek());
                }
            }
        }
    }
}
