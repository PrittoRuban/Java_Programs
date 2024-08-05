import java.util.*;

public class IteragteOverLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Iterator<Integer> iterator = list.iterator();
        int sum = 0;

        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Sum: " + sum);
    }
}
