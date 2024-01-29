import java.util.*;
 
 public class Main{
     
     public static void main(String[]args){
         
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         String s = sc.next();
         StringBuilder sb = new StringBuilder();
         sub(sb,s,0);
     }
     
     static void sub( StringBuilder sb, String s,int a){
         if(sb.length()>0){
             System.out.println(sb);
         }
         
         
         for(int i=a; i<s.length(); i++ ){
             sb.append(s.charAt(i));
             sub(sb,s,i+1);
             sb.deleteCharAt(sb.length()-1);
         }
        
     }
 }
