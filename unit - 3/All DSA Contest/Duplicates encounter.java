import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++){
            if(!st.empty() && st.peek()==str.charAt(i)){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }
        String ans = "";
        while(!st.empty()){
            ans = st.peek() + ans;
            st.pop();
        }
        if(ans == ""){
            System.out.println("Empty String");
        }else{
            System.out.println(ans);
        }
    }
}
