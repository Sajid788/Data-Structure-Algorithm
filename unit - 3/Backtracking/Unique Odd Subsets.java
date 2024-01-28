import java.util.*;
class Main{
    public static boolean flag = false;
    public static void myFun(int n, int [] arr, int k, ArrayList<Integer>result, int index){
        if(result.size()!=0){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(Integer i : result){
                if(map.containsKey(i)){
                    map.put(i, map.get(i) + 1 );
                }else{
                    map.put(i, 1);
                }
                int sum = 0;
                for(Integer y : result){
                    sum += y;
                }
                if(map.size() == k && sum % 2 !=0){
                    flag = true;
                }
            }
        }
        if(result.size()==n){
            return;
        }
        for(int i = index; i<n; i++){
           result.add(arr[i]);
           myFun(n,arr, k, result, i+1);
           result.remove(result.size() - 1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int count = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int index= 0;
        ArrayList<Integer> result = new ArrayList <> ();
        myFun(n, arr, k, result, 0);
        if(flag == true){
            System.out.print("True");
        }else{
            System.out.println("False"); 
        }
    }
}
