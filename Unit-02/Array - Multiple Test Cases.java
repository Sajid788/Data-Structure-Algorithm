import java.util.*;

class Main {
     
     public static void main (String [] args){
         
         Scanner sc = new Scanner(System.in);
          
          int test = sc.nextInt();
         
         for(int t = 0; t<test; t++){
             
            int len = sc.nextInt();
            
             int [] array = new int [len];
            
            for(int i = 0; i<len; i++){
                array [i]= sc.nextInt()+1;
                System.out.print(array[i]+" ");
            }
            System.out.println();
         }
     }
}
