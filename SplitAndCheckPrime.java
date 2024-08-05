
import java.util.*;

public class SplitAndCheckPrime {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.next();
            for (int i = 1; i < n.length(); i++) {
                int a = Integer.parseInt(n.substring(0, i));
                int b = Integer.parseInt(n.substring(i));
                if (isPrime(a) && isPrime(b)) {
                    System.out.println(a + " " + b);
                    return;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        System.out.println(-1);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Example Input/Output 1: Input: 133 Output: 13 3
 */
