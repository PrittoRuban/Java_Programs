import java.math.BigInteger;

public class IntegerConcatenateBitsinReverse {
    public static void main(String[] args) {
        int X = 10;
        int Y = 6;

        String binaryX = new StringBuilder(Integer.toBinaryString(X)).reverse().toString();
        String binaryY = new StringBuilder(Integer.toBinaryString(Y)).reverse().toString();

        StringBuilder B = new StringBuilder();
        int maxLength = Math.max(binaryX.length(), binaryY.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < binaryX.length()) {
                B.append(binaryX.charAt(i));
            }
            if (i < binaryY.length()) {
                B.append(binaryY.charAt(i));
            }
        }

        BigInteger decimalB = new BigInteger(B.toString(), 2);
        System.out.println(decimalB);
    }
}