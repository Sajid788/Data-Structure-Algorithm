import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int chocolates = sc.nextInt();
            int friends = sc.nextInt();
            int Tfriends = (friends*(friends+1)/2);
            if(chocolates>=Tfriends) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
