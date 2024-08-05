import java.util.*;

public class SortFactorsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> factorCounts = new HashMap<>();
        
        // Calculate factors and their counts
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                factorCounts.put(i, getFactorCount(i));
            }
        }
        
        // Sort factors based on the problem statement
        List<Map.Entry<Integer, Integer>> sortedFactors = new ArrayList<>(factorCounts.entrySet());
        sortedFactors.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // Descending order of factor counts
            } else {
                return b.getKey() - a.getKey(); // Descending order of factors themselves
            }
        });
        
        // Print sorted factors
        for (Map.Entry<Integer, Integer> entry : sortedFactors) {
            System.out.print(entry.getKey() + " ");
        }
    }
    
    // Method to calculate the number of factors of a number
    private static int getFactorCount(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}