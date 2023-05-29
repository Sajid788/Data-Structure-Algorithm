import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < N; i++) {
            String strLine = sc.nextLine();
            String[] str = strLine.split(" ");

            if (str[0].equals("PUSH")) {
                int value = Integer.parseInt(str[1]);
                stack.push(value);
                if (minStack.isEmpty() || value <= minStack.peek()) {
                    minStack.push(value);
                }
            } else if (str[0].equals("POP")) {
                if (stack.isEmpty()) {
                    output.append("EMPTY\n");
                } else {
                    int count = stack.pop();
                    if (count == minStack.peek()) {
                        minStack.pop();
                    }
                }
            } else if (str[0].equals("MIN")) {
                if (minStack.isEmpty()) {
                    output.append("EMPTY\n");
                } else {
                    output.append(minStack.peek()).append("\n");
                }
            }
        }

        System.out.print(output.toString());
    }
}
