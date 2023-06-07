import java.util.Scanner;
 class Main {
     public static void main ( String [] args){
         Scanner scn = new Scanner (System.in);
         int t = scn.nextInt();
         while(t--!=0){
             int n = scn.nextInt();
             int [] arr = new int [n];
             for (int i=0; i<n; i++) arr[i] = scn.nextInt();
             int left = 0, right = n-1;
             int leftCount = 0, rightCount = 0;
             int leftSum = 0,  rightSum = 0;
             while (left <= right){
                 if(leftSum <= rightSum*2){
                     leftCount++;
                     leftSum+= arr[left++];
                 }else{
                     rightCount++;
                     rightSum+=arr[right--];
                 }
             }
             System.out.println(leftCount + " " + rightCount);
             }
       }
}
