import java.util.*;  
public class Main  
{  
   public static void main(String args[])  
   {  
        Scanner sc = new Scanner(System.in); 
       int n, i, j, x;  
        n = sc.nextInt(); 
      int[] array = new int[n];
      for(i=0; i<n; i++)
      {
         array[i] = sc.nextInt();
      }
      for(i=0; i<(n-1); i++)
      {
         for(j=0; j<(n-i-1); j++)
         {
            if(array[j]>array[j+1])
            {
               x = array[j];
               array[j] = array[j+1];
               array[j+1] = x;
            }
         }
      }
          for(i=0; i<n; i++)
         System.out.print(array[i]+ " ");
   }
}
