import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            HashSet<String> map = new HashSet<>();
            for(int i = 0; i<n; i++){
                for(int j = i+1; j <= n; j++){
                    map.add(str.substring(i,j));
                }
            }
            System.out.println(map.size());
        }
    }
}
