import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arrA = new int[n][m];
        int sumA = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrA[i][j] = sc.nextInt();
                sumA += arrA[i][j];
            }
        }

        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] arrB = new int[i][j];
        int sumB = 0;

        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                arrB[row][col] = sc.nextInt();
                sumB += arrB[row][col];
            }
        }

        
        if (sumA > sumB) {
            System.out.println(sumA);
        } else {
            System.out.println(sumB);
        }
    }
}
