import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            
            int oddDivisors = 0;
            int evenDivisors = 0;
            
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        evenDivisors++;
                    } else {
                        oddDivisors++;
                    }
                    
                    if (n / i != i) {
                        if ((n / i) % 2 == 0) {
                            evenDivisors++;
                        } else {
                            oddDivisors++;
                        }
                    }
                }
            }
            
            if (oddDivisors > evenDivisors) {
                System.out.println("Odd Skewed");
            } else if (evenDivisors > oddDivisors) {
                System.out.println("Even Skewed");
            } else {
                System.out.println("Not Skewed");
            }
        }
        
    }
}
