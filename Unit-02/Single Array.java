import java.util.*;

class Main {
     
public static void main(String[]args){
    
   Scanner sc  = new Scanner(System.in);
   
   int n = sc.nextInt();
     
   int array[] = new int[n];
       
   
   for(int i = 0; i<n; i++ ){
       
         array[i] = sc.nextInt(); 
        
       System.out.print(array[i]+1 +" ");
   }
 }  

}
