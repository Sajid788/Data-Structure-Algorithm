import java.util.*;
   class Main{
     public static void main(String [] args){
      Scanner sc =  new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
          int number = sc.nextInt();
         int rem = 0; 
         int sum = 0;
         HashSet<Integer>ArrayList = new HashSet<>();
         while(ArrayList.add(number)){
             sum = 0; 
             while(number>=1){
                 rem = number % 10;
                 sum = sum + (rem * rem);
                 number /= 10;
             }
             number = sum;
         }
         if(sum == 1){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
      }
  }
}
