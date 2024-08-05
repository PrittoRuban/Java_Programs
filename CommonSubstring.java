
/**
 * Common Substring - Three String Values
 * The program must accept three string values S1, S2 and S3 as the input.
 * The program must print the longest common substring in S1, S2 and S3.
 * If there are two or more longest common substring values, the program must print the first occurring longest common substring.
 * If there is no such longest common substring, the program must print -1 as the output.
 *
 * Boundary Condition(s):
 * 2 <= Length of S1, S2, S3 <= 100
 *
 * Input Format:
 * The first line contains S1, S2 and S3 separated by a space.
 *
 * Output Format:
 * The first line contains the longest common substring in S1, S2 and S3 or -1.
 *
 * Example Input/Output 1:
 * Input:
 * Abcdefghxyz xyz Abcxyz
 * Output:
 * xyz
 * Explanation:
 * The longest common substring in Abcdefghxyz, xyz and Abcxyz is xyz.
 * So xyz is printed as the output.
 *
 * Example Input/Output 2:
 * Input:
 * Pqrstuv Ab@cdefgh ijklmn@
 * Output:
 * -1
 *
 * Max Execution Time Limit: 500 millisecs
 * */

import java.util.*;

class LongestCommonSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        String S3 = sc.next();

        int len1 = S1.length();
        int len2 = S2.length();
        int len3 = S3.length();

        int[][][] dp = new int[len1 + 1][len2 + 1][len3 + 1];
        int maxLength = 0;
        int endIndex = -1;

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                for (int k = 1; k <= len3; k++) {
                    if (S1.charAt(i - 1) == S2.charAt(j - 1) && S1.charAt(i - 1) == S3.charAt(k - 1)) {
                        dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
                        if (dp[i][j][k] > maxLength) {
                            maxLength = dp[i][j][k];
                            endIndex = i - 1;
                        }
                    } else {
                        dp[i][j][k] = 0;
                    }
                }
            }
        }

        if (maxLength == 0) {
            System.out.println(-1);
        } else {
            System.out.println(S1.substring(endIndex - maxLength + 1, endIndex + 1));
        }
    }
}
