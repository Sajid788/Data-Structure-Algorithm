import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int coins = sc.nextInt();
        int[] cost = new int[n];

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        List<List<Integer>> list = myFun(cost, coins);

        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            for (List<Integer> num : list) {
                for (int i = 0; i < num.size(); i++) {
                    System.out.print(num.get(i));
                    if (i < num.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

        static List<List<Integer>> myFun(int[] cost, int coins) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), cost, coins, 0);
        return list;
    }

     static void backtrack(List<List<Integer>> list, List<Integer> curr, int[] cost, int remCoin, int stIdx) {
        if (remCoin == 0) {
            list.add(new ArrayList<>(curr));
            return;
        }

        for (int i = stIdx; i < cost.length; i++) {
            if (cost[i] <= remCoin) {
                curr.add(cost[i]);
                backtrack(list, curr, cost, remCoin - cost[i], i);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
