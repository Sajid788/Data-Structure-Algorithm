import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int[] prices = new int[N]; 

            for (int i = 0; i < N; i++) {
                prices[i] = sc.nextInt();
            }

            int[] spans = new int[N]; 
            Stack<Integer> stack = new Stack<>(); 
            StringBuilder sb = new StringBuilder(); 


            for (int i = 0; i < N; i++) {
                while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                    stack.pop();
                }

                spans[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
                stack.push(i);

        
                sb.append(spans[i]).append(" ");
            }


            System.out.println(sb.toString());
        }

    }
}
