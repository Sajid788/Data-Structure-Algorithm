import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrive=new int[n];
    int[] depart=new int[n];
    for(int i=0; i<n; i++){
      String str=sc.next();
      str = str.replace(":","");
      arrive[i] = Integer.parseInt(str);
    }
    for(int i=0; i<n; i++){
        String str=sc.next();
        str = str.replace(":","");
       depart[i] = Integer.parseInt(str);
    }
    int a = 1;
    int d = 0;
    int count = 1, platforms = 1;
    while(a<n && d<n){
      if(arrive[a] < depart[d]) {
        platforms++;
        a++;
        if(platforms>count) 
        count = platforms;
      } else {
        platforms--;
        d++;
      }
    }
    System.out.println(count);
  }
}
