import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
            while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int totalBalloons = myFun(n, s);
            System.out.println(totalBalloons);
        }
    }

     static int myFun(int n, String s) {
        int total = 0;
        boolean[] arr = new boolean[26];

        for (int i = 0; i < n; i++) {
            char problem = s.charAt(i);
            int index = problem - 'A';
            if (!arr[index]) {
               total++;
               arr[index] = true;
            }
           total++;
        }

        return total;
    }
}
