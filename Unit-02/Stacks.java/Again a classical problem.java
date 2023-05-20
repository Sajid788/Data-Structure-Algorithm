import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0; i<num; i++){
            String Str = sc.next();
            char[] arr = Str.toCharArray();
            Stack<Character>st = new Stack<>();
            boolean match = true;
            for(int j =0; j<arr.length;j++){
                if(arr[j] == '(' || arr [j] == '{' || arr[j] == '['){
                    st.push(arr[j]);
                }else{
                    if(st.isEmpty()){
                        match = false;
                        break;
                    }
                    if(st.peek() == '(' && arr[j] == ')'){
                        st.pop();
                    }else if(st.peek() == '{' && arr[j] == '}'){
                        st.pop();
                    }else if(st.peek() == '[' && arr[j] == ']'){
                        st.pop();
                    }else{
                        match = false;
                        break;
                    }
                }
            }
            if(match){
                if(st.isEmpty()){
                    System.out.println("balanced");
                }else{
                   System.out.println("not balanced"); 
                }
            }
            if(!match){
                 System.out.println("not balanced");
            }
        }
    }
}
