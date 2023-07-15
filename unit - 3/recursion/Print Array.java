import java.util.Scanner;

class Main {
    public static void traverseArray(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i] + " ");
        traverseArray(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        
        traverseArray(arr, 0); 
    }
}
