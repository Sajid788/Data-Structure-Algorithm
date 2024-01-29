import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] coins = new int [n];
        for(int i = 0; i<n; i++){
            coins [i] = sc.nextInt();
        }
        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        for(int coin : coins){
            Set<Integer> newSums = new HashSet<>(sums);
            for(int sum : sums){
                newSums.add(sum + coin);
            }
            sums.addAll(newSums);
        }
        List<Integer> temp = new ArrayList<>(sums);
        Collections.sort(temp);
        temp.remove(0);
        System.out.println(temp.size());
        for(int sum : temp){
            System.out.print(sum+" ");
        }
    }
}
