import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int [] arr = new int [N];
            for(int i = 0; i<N; i++){
                arr [i] = sc.nextInt();
            }
            HashMap <Integer, Integer> mp = new HashMap<>();
            for(int i = 0; i<N; i++){
                int temp = arr[i];
               if(mp.containsKey(temp)){
                   mp.put(temp, mp.get(temp) + 1); 
               }else{
                  mp.put(temp, 1); 
               }
            }
            for(Map.Entry<Integer,Integer> hm : mp.entrySet()){
                if(hm.getValue() == 1){
                    System.out.println(hm.getKey());
                }
            }
        }
    }
}
