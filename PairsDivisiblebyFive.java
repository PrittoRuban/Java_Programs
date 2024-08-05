import java.util.ArrayList;
import java.util.Scanner;

public class PairsDivisiblebyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int i = 1; i <= M; i++) {
            list1.add(i);
        }
        for (int i = 1; i <= N; i++) {
            list2.add(i);
        }
        
        int count = 0;
        for (int num1 : list1) {
            for (int j = 0; j < list2.size(); j++) {
                int num2 = list2.get(j);
                if ((num1 + num2) % 5 == 0) {
                    count++;
                    list2.remove(j);
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}