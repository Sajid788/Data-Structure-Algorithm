import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 

        int[] arr = new int[N]; 


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int maxFrequencyInteger = 0;

        for (int i = 0; i < N; i++) {
            int num = arr[i];
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            if (frequencyMap.get(num) > maxFrequency) {
                maxFrequency = frequencyMap.get(num);
                maxFrequencyInteger = num;
            }
        }

    
        System.out.println(maxFrequencyInteger);
    }
}
