import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            String country = input[input.length - 1];
            map.put(country, map.getOrDefault(country, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}