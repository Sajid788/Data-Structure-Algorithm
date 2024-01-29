import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> map = new HashSet<>();
        for(int coin : arr){
        map.add(0);
        Set<Integer> newMap = new HashSet<>(map);
        for(int sum : map){
            newMap.add(sum + coin);
        }
        map.addAll(newMap);
        
        }
        List<Integer>temp = new ArrayList<>(map);
        Collections.sort(temp);
        temp.remove(0);
        System.out.println(temp.size());
        for(int sum : temp){
            System.out.print(sum + " ");
        }
    }
}
