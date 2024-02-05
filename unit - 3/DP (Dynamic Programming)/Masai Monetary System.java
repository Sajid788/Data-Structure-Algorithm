import java.util.*;

public class Main {
    static HashMap<Integer, Long> map = new HashMap<>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(myFun(n));
        }
    }

    public static long myFun(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        
        if (n <= 11) {
            map.put(n, (long)n);
            return n;
        }

        long result = myFun(n / 2) + myFun(n / 3) + myFun(n / 4);
        map.put(n, result);
        return result;
    }
}
