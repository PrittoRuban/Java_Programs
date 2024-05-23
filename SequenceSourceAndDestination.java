import java.util.*;

public class SequenceSourceAndDestination {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashMap<String, String> map = new HashMap<>();
            HashSet<String> destinations = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String source = sc.next();
                String destination = sc.next();
                map.put(source, destination);
                destinations.add(destination);
            }
            String start = null;
            for (String source : map.keySet()) {
                if (!destinations.contains(source)) {
                    start = source;
                    break;
                }
            }
            while (map.containsKey(start)) {
                String destination = map.get(start);
                System.out.println(start + " to " + destination);
                start = destination;
            }
        }
    }
}