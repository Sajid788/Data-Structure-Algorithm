import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int m = 0; m<t; m++){
          HashMap<Character,Integer> map = new HashMap<>();
          int size = sc.nextInt();
          String s = sc.next();
          for(int i =0; i<s.length();i++){
              char c =s.charAt(i);
              map.put(c,map.getOrDefault(c,0)+1);
          }
          int count=0;
          for(Map.Entry<Character,Integer>i:map.entrySet()){
              if(i.getValue()%2==1){
                count++;  
              }
          }
          if(count>1){
              System.out.println("Not Possible!");
          }else{
              System.out.println("Possible!");
          }
        }
    }
}
