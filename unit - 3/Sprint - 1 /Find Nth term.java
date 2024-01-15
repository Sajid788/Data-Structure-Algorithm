import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fun(n);
        System.out.println(ans);
    }
    public static int fun(int n) {
        if (n == 0 || n == 1) {
            return 10;
        }
        if (n == 2) {
            return -19;
        }
        if (n % 2 == 0 && n % 3 == 0) {
            return n / 6 + (fun(n - 1) + fun(n - 3));
        }
        if (n % 2 == 0) {
            return n / 2 - (fun(n - 1) + fun(n - 2));
        }
        if (n % 3 == 0) {
            return n / 3 + (fun(n - 1) + fun(n - 3));
        }
        return fun(n - 1);
    }
}
