import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        
            int [] arr = new int [n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i<n; i++){
                int temp = arr[i];
                if(map.containsKey(temp)){
                    map.put(temp, map.get(temp)+1);
                }else{
                    map.put(temp,1);
                }
            }
            int maxCount = 0;
            int result   = 0;
            for(Map.Entry<Integer,Integer> i : map.entrySet()){
                if(i.getValue()>maxCount){
                    maxCount = i.getValue();
                    result = i.getKey();
                }
            }
            System.out.println(result);
        }
    }
