import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            long[] weights = new long[n];

            
            for (int i = 0; i < n; i++) {
                weights[i] = sc.nextLong();
            }

            long harryWeight = 0;
            long johnWeight = 0;

            int left = 0; 
            int right = n - 1; 
            long prevWeight = 0; 

            boolean harryTurn = true; 

            while (left <= right) {
                long currentWeight = 0;
                if (harryTurn) {
                    while (left <= right && currentWeight <= prevWeight) {
                        currentWeight += weights[left++];
                    }
                    harryWeight += currentWeight;
                } else {
                    while (left <= right && currentWeight <= prevWeight) {
                        currentWeight += weights[right--];
                    }
                    johnWeight += currentWeight;
                }

                prevWeight = currentWeight;
                harryTurn = !harryTurn;
            }

            System.out.println(harryWeight + " " + johnWeight);
        }

    }
}
