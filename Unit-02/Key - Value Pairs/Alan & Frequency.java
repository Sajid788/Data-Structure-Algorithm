import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        for(Character key: map.keySet()){
            System.out.println(key +"-"+ map.get(key));
        }
    }
}
    
