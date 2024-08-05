import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrimeGenerator implements Runnable {
    private final int start;
    private final int end;

    PrimeGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class GeneratePrimes {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int threads = sc.nextInt();
            List<Thread> threadList = new ArrayList<>();
            int start = 1;
            int end = n / threads;
            for (int i = 0; i < threads; i++) {
                if (i == threads - 1) {
                    end = n;
                }
                Thread thread = new Thread(new PrimeGenerator(start, end));
                threadList.add(thread);
                thread.start();
                start = end + 1;
                end += n / threads;
            }
            for (Thread thread : threadList) {
                thread.join();
            }
        }
    }
}
