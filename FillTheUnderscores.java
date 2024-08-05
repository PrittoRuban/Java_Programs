import java.util.*;

public class FillTheUnderscores {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();

            List<Integer> slotLengths = new ArrayList<>();
            List<Integer> stringLengths = new ArrayList<>();

            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '_') {
                    count++;
                } else if (count > 0) {
                    slotLengths.add(count);
                    count = 0;
                }
            }
            if (count > 0) {
                slotLengths.add(count);
            }

            for (int i = 0; i < n; i++) {
                stringLengths.add(sc.nextLine().length());
            }

            Collections.sort(slotLengths);
            Collections.sort(stringLengths);

            int slotsFilled = 0;
            for (int slotLength : slotLengths) {
                if (stringLengths.contains(slotLength)) {
                    slotsFilled++;
                    stringLengths.remove(stringLengths.indexOf(slotLength));
                }
            }

            System.out.println(slotsFilled);
        }
    }
}