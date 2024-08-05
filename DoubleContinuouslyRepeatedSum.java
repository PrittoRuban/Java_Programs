import java.util.*;

class DoubleContinuouslyRepeatedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int sum = 0, prev = -1, prevVal = 0;
        for (String s : input) {
            int n = Integer.parseInt(s);
            if (n == prev) {
                n = prevVal * 2;
                prevVal *= 2;
            } else {
                prev = n;
                prevVal = n;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}