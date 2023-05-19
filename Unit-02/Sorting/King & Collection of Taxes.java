
import java.util.*;

 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] taxes = new int[2 * N];
        
        for (int i = 0; i < 2 * N; i++) {
            taxes[i] = sc.nextInt();
        }
        
        Arrays.sort(taxes); 
        
        int totalTaxCollected = 0;
        for (int i = N; i < 2 * N; i++) {
            totalTaxCollected += taxes[i];
        }
        
        System.out.println(totalTaxCollected);
    }
}
