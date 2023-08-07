import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        Arrays.sort(s);
        Arrays.sort(c);
       long result = 0;
       for(int i = 0; i<n; i++){
           result += s[i] * c[i];
       }
       System.out.println(result);
    }
}
