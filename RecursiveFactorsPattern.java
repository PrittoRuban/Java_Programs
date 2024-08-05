import java.util.*;

public class RecursiveFactorsPattern {
    public static void findFactors(int num, int depth) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        for (Integer factor : factors) {
            char[] hyphens = new char[depth];
            Arrays.fill(hyphens, '-');
            System.out.println(new String(hyphens) + factor);
            if (factor != 1 && factor != num) {
                findFactors(factor, depth + 1);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            System.out.println("-" + N);
            findFactors(N, 2);
        }
    }
}