import java.util.Scanner;

public class Main {

    static void myFun(String str, int index, String current) {
        if (index == str.length()) {
            if (!current.isEmpty()) {
                System.out.println(current);
            }
            return;
        }

        myFun(str, index + 1, current + str.charAt(index));
        myFun(str, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String str = scanner.nextLine();

        myFun(str, 0, "");
    }
}
