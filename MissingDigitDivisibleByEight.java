public class MissingDigitDivisibleByEight {
    public static void main(String[] args) {
        System.out.println(findMissingDigit("543X0")); // prints 2
        System.out.println(findMissingDigit("12X515")); // prints -1
        System.out.println(findMissingDigit("X16")); // prints 2
    }

    public static int findMissingDigit(String num) {
        int index = num.indexOf('X');
        int i = 0;
        if(index == 0) i = 1;
        while(i <= 9) {
            String newNum = num.substring(0, index) + i + num.substring(index + 1);
            if (Integer.parseInt(newNum) % 8 == 0) {
                return i;
            }
        }
        return -1;
    }
}