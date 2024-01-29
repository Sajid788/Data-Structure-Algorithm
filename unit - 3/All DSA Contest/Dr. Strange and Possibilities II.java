import java.util.*;
class Main{
    public static void solve(List<List<Integer>> ans,List<Integer> curr, int index,int[]a,HashSet<List<Integer>>map){
        if (!map.contains(curr)){
            ans.add(new ArrayList<> (curr));
            map.add(new ArrayList<> (curr));
        }
        for ( int i = index; i < a.length; i++){
            curr.add(a[i]);
            solve ( ans , curr,i+1, a, map);
            curr.remove(curr.size()-1);
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for ( int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        HashSet<List<Integer>> map = new HashSet<>();
        Arrays.sort(a);
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans , new ArrayList<>(),0,a,map);
        for ( List <Integer> i: ans){
        for ( Integer j : i) System.out.print(j + " ");
               System.out.println();
        }
    }
}
