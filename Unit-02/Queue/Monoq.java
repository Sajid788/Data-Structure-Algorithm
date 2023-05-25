import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<Character>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        for(int  i = 0; i<n; i++){
            char nextChar = str.charAt(i);
            while (!st.empty() && st.peek() > nextChar && k- st.size() <= n-i-1){
                st.pop();
            }
            if(st.size() < k){
                st.push(nextChar);
            }
        }
        String ans = "";
        while(!st.empty()){
            ans  = st.peek() + ans;
            st.pop();
        }
        System.out.println(ans);
    }
}
