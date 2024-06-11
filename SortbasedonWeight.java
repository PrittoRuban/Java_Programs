import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arra = new int[num];
        int[] weight = new int[num];
        int[] temp = {0, 3, 4, 5, 7, 8, 9, 12};

        for(int ele = 0; ele < num; ele++) {
            weight[ele] = 0;
            arra[ele] = scanner.nextInt();
            if(Math.sqrt(arra[ele]) == (int)Math.sqrt(arra[ele]))
                weight[ele] += 5;
            if(arra[ele] % 4 == 0 && arra[ele] % 6 == 0)
                weight[ele] += 7;
            else if(arra[ele] % 2 == 0)
                weight[ele] += 3;
        }

        for(int foo = 0; foo < 8; foo++) {
            for(int ele = 0; ele < num; ele++) {
                if(weight[ele] == temp[foo])
                    System.out.println(arra[ele] + " " + weight[ele]);
            }
        }
        scanner.close();
    }
}