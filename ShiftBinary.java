import java.util.*;

public class ShiftBinary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(maxShiftedVal(n));
        }
    }

    private static int maxShiftedVal(int n) {
        String binary = Integer.toBinaryString(n);
        int maxVal = n;
        for (int i = 0; i < binary.length(); i++) {
            binary = binary.substring(1) + binary.charAt(0);
            int shiftedVal = Integer.parseInt(binary, 2);
            maxVal = Math.max(maxVal, shiftedVal);
        }
        return maxVal;
    }
}