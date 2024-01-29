import java.util.*;

public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         myFun(arr, 0, n - 1);
         for(int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
     }
     
     static void myFun(int arr[], int start, int end) {
         if(start < end) {
             int mid = start + (end - start) / 2;
             myFun(arr, start, mid);
             myFun(arr, mid + 1, end);
             merge(arr, start, mid, end);
         }
     }
     
     static void merge(int arr[], int start, int mid, int end) {
         int merge[] = new int[end - start + 1];
         int index1 = start;
         int index2 = mid + 1;
         int index = 0;
         
         while(index1 <= mid && index2 <= end) {
             if(arr[index1] >= arr[index2]) {
                 merge[index] = arr[index1];
                 index++;
                 index1++;
             } else {
                 merge[index] = arr[index2];
                 index++;
                 index2++;
             }
         }
         while(index1 <= mid) {
             merge[index] = arr[index1];
             index++;
             index1++;
         }
         while(index2 <= end) {
             merge[index] = arr[index2];
             index++;
             index2++;
         }
         
         for(int i = 0, j = start; i < merge.length; i++, j++) {
              arr[j] = merge[i];
         }
     }
}
