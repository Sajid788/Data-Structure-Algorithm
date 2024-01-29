import java.util.*;
class Main{
    static List< List<Integer>> problem = new ArrayList<>();
    public static void swap ( int[] arr, int i , int j){
        int temp = arr [i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int myFun( int[] arr, int length, int height, int sum, int l1, int r1){
            if (length>height){
            if (sum %2 == 1){
                return 1;
            }
            return 0;
        }
        int problem = 0;
        for ( int i = length; i<=height; i++){
            swap(arr,i,length);
            if (length>= l1 && length<=r1){
                problem += myFun(arr, length+1, height , sum + arr[length],l1,r1);
            }else{
                problem+= myFun(arr,length+1, height, sum,l1,r1);
            }
            swap(arr,i,length);
        }
        return problem;
    }
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n ; i++) arr[i] = i+1;
        int len = s.nextInt();
        int row = s.nextInt();
        System.out.println(myFun(arr,0,n-1,0,len,row));
    }
}
