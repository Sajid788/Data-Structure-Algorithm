import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0) {
      int n=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
      int[] ai=new int[n];
      int[] bi=new int[n];
      
      for(int i=0; i<n; i++){
        ai[i]=sc.nextInt();
        bi[i]=sc.nextInt();
      }
      Arrays.sort(ai);
      Arrays.sort(bi);
      int count = 0;
      for(int i=0; i<n; i++){
        if(bi[i]>ai[i]) {
          count += (bi[i] - ai[i])*x;
        }
        else if (bi[i]<ai[i]) {
          count += (ai[i] - bi[i])*y;
        }
      }
      System.out.println(count);
    }   
  }
}
