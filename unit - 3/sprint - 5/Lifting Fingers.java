import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            
            int count =  1;
                for(int j = 1; j<str.length(); j++){
                    if(str.charAt(j) != str.charAt(j-1)){
                   count++;
                }
            }
            System.out.println(count);
        }
    }
}
