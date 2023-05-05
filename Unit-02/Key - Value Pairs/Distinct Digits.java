import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int i = sc.nextInt();
            int r = sc.nextInt();
            int ans = -1;
            for (int x = i; x <= r; x++) {
                boolean[] sajid = new boolean[10];
                int num = x;
                boolean unique = true;
                while (num > 0) {
                    int digit = num % 10;
                    if (sajid[digit]) {
                        unique = false;
                        break;
                    }
                    sajid[digit] = true;
                    num /= 10;
                }
                if (unique) {
                    ans = x;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
