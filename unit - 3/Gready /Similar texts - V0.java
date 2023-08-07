import java.util.*;

class Main {
    public static int myFun(char[] v, char[] r, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        } else if (v[n - 1] == r[m - 1]) {
            return 1 + myFun(v, r, n - 1, m - 1);
        } else {
            return Math.max(myFun(v, r, n, m - 1), myFun(v, r, n - 1, m));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vrt = sc.next();
        char[] v = new char[vrt.length()];
        for (int i = 0; i < vrt.length(); i++) {
            v[i] = vrt.charAt(i);
        }
        String rht = sc.next();
        char[] r = new char[rht.length()];
        for (int i = 0; i < rht.length(); i++) {
            r[i] = rht.charAt(i);
        }
        int n = vrt.length();
        int m = rht.length();
        System.out.print(myFun(v, r, n, m));
    }
}
