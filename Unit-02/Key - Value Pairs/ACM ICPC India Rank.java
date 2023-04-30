import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        String[] cnt= new String[N];
        for (int i = 0; i < N; i++) {
            cnt[i] = sc.next();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (cnt[i].equals("India")) {
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
