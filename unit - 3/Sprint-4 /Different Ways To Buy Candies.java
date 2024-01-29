import java.util.*;
 public class Main {
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int coin = sc.nextInt();
         int arr [] = new int [n];
         for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
         }
         print(arr,coin);
     }
     static void find(int [] arr, int i, int total, List<Integer> curr, int coin, Set<String> unique){
         if(total==coin){
             StringBuilder sb = new StringBuilder();
             for(int candy : curr){
                 sb.append(candy).append(" ");
             }
             unique.add(sb.toString().trim());
             return;
         }
         
         if(total>coin || i==arr.length){
             return;
         }
         curr.add(arr[i]);
         find(arr,i,total+arr[i],curr,coin,unique);
         curr.remove(curr.size()-1);
         find(arr,i+1, total,curr,coin,unique);
     }
     static void print(int [] arr, int coin){
         Set<String> unique = new TreeSet<>();
         find(arr,0,0,new ArrayList<>(),coin,unique);
         if(unique.isEmpty()){
             System.out.println(-1);
             return;
         }
         for(String ans : unique) {
             System.out.println(ans);
         }
     }
 }
