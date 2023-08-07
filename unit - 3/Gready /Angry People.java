import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>(); 
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                list.add(0, arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        int maxValue = 0; 
        for (int i = 1; i < n; i++) { 
            int count = Math.abs(list.get(i - 1) - list.get(i));
            if (count > maxValue) {
                maxValue = count; 
            }
        }
        System.out.print(maxValue);
    }
}
