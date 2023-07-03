import java.util.*;
class Main{
    public static String find(String t){
        int [] hash = new int [26];
        Queue<Character> q = new LinkedList<>();
        StringBuffer str = new StringBuffer();
        for(int i = 0; i<t.length(); i++){
            q.add(t.charAt(i));
            int temp = t.charAt(i)-'a';
            hash[temp]++;
            while(!q.isEmpty()){
                if(hash[q.peek()-'a'] > 1) q.remove();
               else{
                str.append(q.peek());
                break;
            }
        }
        if(q.isEmpty()) str.append("#");
    }
    return str.toString();
} 
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while(test-->0){
        String t = sc.next();
        System.out.println(find(t));
       }
    }
}
