import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        
        for (int i = 0; i < n; i++) {
    
            while (!queue.isEmpty() && arr[i] <= arr[queue.peek()]) {
                queue.poll();
            }

    
            if (queue.isEmpty()) {
                count++;
            }


            queue.add(i);
        }

        
        System.out.println(count);
    }
}
