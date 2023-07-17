import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap <>();
        for(int i = 0; i<n; i++){
            int temp = arr[i];
            if(map.containsKey(temp)){
              map.put(temp , map.get(temp) + 1 );  
            }else{
                map.put(temp,1);
            }
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> hm : map.entrySet()){
            if(hm.getValue()==1){
                sum += hm.getKey();
            }
        }
        System.out.println(sum);
    }
}
