import java.util.*;

public class Main {

    static long myFun(String str) {
        if (str.length() == 1) {
            return Long.parseLong(str);
        }

        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        return myFun(String.valueOf(sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();
            long result = myFun(n);
            System.out.println(result);
        }
    }
}
