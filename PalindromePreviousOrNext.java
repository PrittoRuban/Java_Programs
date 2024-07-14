
import java.util.Scanner;

class PalindromeTransformation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        if (canBePalindrome(S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean canBePalindrome(String S) {
        int len = S.length();

        for (int i = 0; i < len / 2; i++) {
            char left = S.charAt(i);
            char right = S.charAt(len - i - 1);

            if (!canMatch(left, right)) {
                return false;
            }
        }

        return true;
    }

    private static boolean canMatch(char left, char right) {
        if (left == right) {
            return true;
        }
        if ((left == 'A' && right == 'B') || (left == 'B' && right == 'A')) {
            return true;
        }
        if ((left == 'Z' && right == 'Y') || (left == 'Y' && right == 'Z')) {
            return true;
        }
        if ((left == 'a' && right == 'b') || (left == 'b' && right == 'a')) {
            return true;
        }
        if ((left == 'z' && right == 'y') || (left == 'y' && right == 'z')) {
            return true;
        }
        if (Math.abs(left - right) <= 2) {
            return true;
        }
        return false;
    }
}
