import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        String str = sc.next();
        int M = sc.nextInt(); 
        String s = sc.next(); 

        
        Map<Character, Integer> map = new HashMap<>();
             for(int i=0; i<N; i++) {
                 char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        boolean flag = true;

       
        for (int i = 0; i<M; i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                flag = false;
                break;
            }
            map.put(ch, map.get(ch) - 1);
        }

     
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
