import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc =  new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int  i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> result = new ArrayList<>();
        result.add(arr[n-1]);
        int maxMark = arr[n-1];
        for(int i = n-2; i>=0;i--){
            if(arr[i]>=maxMark){
                result.add(arr[i]);
                maxMark = arr[i];
            }
        }
        for(int i = result.size()-1; i>=0; i--){
            System.out.print(result.get(i)+" ");
        }
    }
}
