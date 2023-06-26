import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers);
        int k = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != k) {
                System.out.println(k);
                break;
            }
            k++;
        }

    }
}
