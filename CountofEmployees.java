import java.time.LocalTime;
import java.util.*;

class Employee {
    String name;
    String status;
    LocalTime time;

    Employee(String name, String status, String time) {
        this.name = name;
        this.status = status;
        this.time = LocalTime.parse(time);
    }
}

public class CountofEmployees {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int R = sc.nextInt();
            sc.nextLine();

            List<Employee> records = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String[] record = sc.nextLine().split(" ");
                records.add(new Employee(record[0], record[1], record[2]));
            }

            LocalTime T = LocalTime.parse(sc.nextLine());

            records.sort(Comparator.comparing(e -> e.time));

            int count = 0;
            for (Employee e : records) {
                if (e.time.isAfter(T)) break;
                if (e.status.equals("IN")) count++;
                else if (e.status.equals("OUT")) count--;
            }

            System.out.println(count);
        }
    }
}