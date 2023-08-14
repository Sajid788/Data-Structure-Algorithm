import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < testCases; t++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            if (areStringsSimilar(s1, s2)) {
                System.out.println("Angry");
            } else {
                System.out.println("Not angry");
            }
        }

    }

     static boolean areStringsSimilar(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }

        char c1 = Character.toLowerCase(s1.charAt(0));
        char c2 = Character.toLowerCase(s2.charAt(0));

        if (c1 != c2) {
            return false;
        }

        return areStringsSimilar(s1.substring(1), s2.substring(1));
    }
}
