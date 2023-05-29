import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        int N = sc.nextInt();
        
    
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        sortInWavePattern(arr);
        
        
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        
    
    }
    
    public static void sortInWavePattern(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
