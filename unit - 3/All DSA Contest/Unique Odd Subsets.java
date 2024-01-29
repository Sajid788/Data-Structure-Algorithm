import java.util.*;
class Main{
    public static boolean flag = false;
    public static void myFun(int n, int [] arr, int k, ArrayList<Integer>ans, int index){
        if(ans.size()!=0){
            HashMap<Integer, Integer> mp = new HashMap<>();
            for(Integer i : ans){
                if(mp.containsKey(i)){
                    mp.put(i, mp.get(i) + 1 );
                }else{
                    mp.put(i, 1);
                }
                int sum = 0;
                for(Integer y : ans){
                    sum += y;
                }
                if(mp.size() == k && sum % 2 !=0){
                    flag = true;
                }
            }
        }
        if(ans.size()==n){
            return;
        }
        for(int i = index; i<n; i++){
           ans.add(arr[i]);
           myFun(n,arr, k, ans, i+1);
           ans.remove(ans.size() - 1);
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
        ArrayList<Integer> ans = new ArrayList <> ();
        myFun(n, arr, k, ans, 0);
        if(flag == true){
            System.out.print("True");
        }else{
            System.out.println("False"); 
        }
    }
}
