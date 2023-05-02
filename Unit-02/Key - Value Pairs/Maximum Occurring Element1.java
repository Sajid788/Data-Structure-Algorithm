import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int maxNum = A[0];
        for (int num : A) {
            if (map.containsKey(num)) {
                int count = map.get(num) + 1;
                map.put(num, count);
                if (count > maxCount || (count == maxCount && num < maxNum)) {
                    maxCount = count;
                    maxNum = num;
                }
            } else {
                map.put(num, 1);
                if (1 > maxCount) {
                    maxCount = 1;
                    maxNum = num;
                }
            }
        }
        System.out.println(maxNum);
    }
}
