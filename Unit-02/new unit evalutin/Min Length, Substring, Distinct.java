import java.util.*;
public class Main{
    public static int unique(StringBuilder sb){
        HashSet<Character> set = new HashSet<>();
        for(int j = 0; j<sb.length(); j++){
               set.add(sb.charAt(j));
           }
        //   System.out.println(set.size());
       return set.size(); 
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String  str = sc.next();
        int n = str.length();
        
        int uc = Integer.MIN_VALUE;
        int len = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
           StringBuilder sb = new StringBuilder();
           for(int j = i; j<n; j++){
               sb.append(str.charAt(j));
               
               int a = unique(sb);
               int b = sb.length();
            //   System.out.println(sb);
               if(uc<a){
                   uc = a;
                   list.clear();
                   list.add(b); 
               }
               else if(uc==a){
                   list.add(b);
               }  
           }
        }
        System.out.println(Collections.min(list));
    }
}
