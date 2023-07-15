import java.util.*;
class Main{
    public static void characterString(String str, int i){
        if(i==str.length()){
            return;
        }
        System.out.println(str.charAt(i));
        characterString(str, i+1);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            characterString(str, 0);
    }
}
