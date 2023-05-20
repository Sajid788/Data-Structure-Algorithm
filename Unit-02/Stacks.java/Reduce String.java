import java.util.*;
 class Main{
    public  static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String z = sc.nextLine();
        int num = z.length();
         Stack <Character> st = new Stack<Character>();
      for ( int i = 0; i<num; i++){
          if(!st.empty()&&st.peek()==z.charAt(i)){
              st.pop();
          }else{
              st.push(z.charAt(i));}}
        String get = "";
        while(!st.empty()){
            get = st.peek()+get;
            st.pop();
        }
            if(get == ""){
                    System.out.println("Empty String");
                }else{
                    System.out.println(get);
                }
           }
      }
