import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String [] str = sc.nextLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            String s = sc.nextLine();
            int count = 0;
            int left = 0;
            int right = s.length()-1;
            
            while(left<right){
               if(s.charAt(left) != s.charAt(right)){
                   count++;
               }
               left++;
               right--;
        }
        if(count<=k){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
  }
}
