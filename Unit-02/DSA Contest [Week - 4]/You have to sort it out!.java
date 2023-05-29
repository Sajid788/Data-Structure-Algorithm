import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] A = new int[m];

        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        int[] indices = new int[m];
        for (int i = 0; i < m; i++) {
            indices[i] = i;
        }


        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                if (A[j] > A[j + 1]) {
            
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;

                    
                    int tempIndex = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = tempIndex;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.print(indices[i] + " ");
        }
    }
}
