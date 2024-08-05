import java.util.Arrays;
import java.util.stream.IntStream;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] evenNumbers = IntStream.of(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(evenNumbers));
    }
}
