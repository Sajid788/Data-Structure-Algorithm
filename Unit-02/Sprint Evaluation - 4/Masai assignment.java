import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t;i++){
            String str = sc.nextLine();
            StringBuilder result = new StringBuilder();
            for(char c : str.toCharArray()){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
                   || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                       continue;
                   }
                   if(c>='A'&& c<='Z'){
                       c = (char) (c + 32);
                   }
                   result.append('.').append(c);
            }
            System.out.println(result.toString());
        }
    }
}
