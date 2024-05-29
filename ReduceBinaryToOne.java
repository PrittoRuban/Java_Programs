class Solution {

    public int numSteps(String s) {
        int steps = 0;
        boolean carry = false;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == '1' ^ carry) {
                steps += 2;
                carry = true;
            } else {
                steps += 1;
                carry = carry && s.charAt(i) == '1';
            }
        }
        return steps + (carry ? 1 : 0);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numSteps("1101"));
    }
}