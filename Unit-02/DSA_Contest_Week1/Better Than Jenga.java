import java.util.*;

class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
            int red_ball_count = 0; 
            int blue_ball_count = 0; 
            for(Map.Entry<Character, Integer> e: map.entrySet()){
                if(e.getKey() == 'R') {
                    red_ball_count = e.getValue();
                }
                if(e.getKey() == 'B'){
                    blue_ball_count = e.getValue();
                }
            }
            int moves = Math.min(red_ball_count, blue_ball_count);
            if(moves % 2 == 0){
                System.out.println("Sachin");
            } else {
                System.out.println("Ankush");
            }
        }
    }
}
