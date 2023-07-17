import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = removeDuplicates(str);
        System.out.println(s);
    }
    public static String removeDuplicates(String str){
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for(int i = 0; i<n; i++){
            char curr = str.charAt(i);
            boolean isDuplicates = false;
            
            for(int j = 0; j<i; j++){
                if(str.charAt(j)==curr){
                    isDuplicates = true;
                    break;
                }
            }
            if(!isDuplicates){
                ans.append(curr);
            }
        }
        return ans.toString();
    }
}
