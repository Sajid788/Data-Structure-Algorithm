import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0) {
      int lenBoys = sc.nextInt();
      int lenGirls = sc.nextInt();
      int[] boys = new int[lenBoys];
      int[] girls = new int[lenGirls];
      for(int i=0; i<lenBoys; i++) {
        boys[i] = sc.nextInt();
      }
      for(int i=0; i<lenGirls; i++) {
        girls[i] = sc.nextInt();
      }
        Arrays.sort(boys);
        Arrays.sort(girls);
        boolean possible = true;
        for(int i=0; i<lenBoys && possible; i++) {
          if(boys[i]<=girls[i]) {
            possible = false;
          }
        }
       if(possible){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
      }
    }
  }
