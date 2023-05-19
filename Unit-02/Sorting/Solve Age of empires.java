import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int [2*num];
        for(int i = 0;i<2*num; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i<2*num; i++){
            if(i%2==0){
                count = count+arr[i];
                
            }
        }
        System.out.println(count);
    }
    
}
