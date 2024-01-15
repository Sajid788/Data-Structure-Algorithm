import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while(t-->0) {
            long n = sc.nextLong(); 

            int steps = myFun(n);
            System.out.println(steps);
        }
    }
    public static int myFun(long n) {
        int steps = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n = (4 * n) / 5;
            } else if (n % 3 == 0) {
                n = (2 * n) / 3;
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                return -1;
            }

            steps++;
        }

        return steps;
    }
}
