import java.util.*;
class Main {
    static void bubbleSort( int arr [], int k){
        int s = arr.length;
        for ( int i = 0; i < s-1; i++)
         for ( int j = 0; j < s-i-1; j++)
         if (arr[j]%k>arr[j+1]%k){
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
         }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,k);
        for ( int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
      }
   }
