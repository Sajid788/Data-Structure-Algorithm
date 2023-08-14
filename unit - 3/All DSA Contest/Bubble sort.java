import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int noSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwaps++;
                }
            }

            if (noSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + noSwaps + " swaps");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }
}
