import java.util.*;
class Main{
     public static void function(int n, int [] arr){
         Stack<Integer> st1 = new Stack <>();
         Stack<Integer> st2 = new Stack <>();
         List <Integer> a = new ArrayList <>();
         List <Integer> b = new ArrayList <>();
         List <Integer> ans = new ArrayList <>();
         for(int i = 0; i<n; i++){
             while(!st1.isEmpty() && arr[st1.peek()] <= arr[i]){
                 st1.pop();
             }
             if(st1.isEmpty()){
               a.add(-1);  
             }else{
                 a.add(st1.peek()+1);
             }
             st1.push(i);
         }
         for(int i = n-1; i>=0; i--){
             while(!st2.isEmpty() && arr[st2.peek()] <= arr[i]){
                 st2.pop();
             }
             if(st2.isEmpty()){
                 b.add(-1);
             }else{
                 b.add(st2.peek() + 1);
             }
             st2.push(i);
         }
         Collections.reverse(b);
         for(int i = 0; i<n; i++){
             ans.add(a.get(i) + b.get(i));
         }
         for(int i = 0; i<n; i++){
             System.out.print(ans.get(i) +" ");
         }
     }
     
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       function(n, arr);
    }
}
