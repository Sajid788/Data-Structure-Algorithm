import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            String t = sc.next();
            Stack<Character> st = new Stack<>();
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == '#') {
                    if (!st.empty()) {
                        st.pop();
                    } 
                } else {
                    st.push(t.charAt(j));
                }
            }
            String result = "";
            while (!st.empty()) {
                result = st.pop() + result;
            }
            System.out.println(result);
        }
    }
}
