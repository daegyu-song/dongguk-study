import java.util.Scanner;

public class BOJ2581 {

    static int M, N, sum = 0, min = -1;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        for (int i = M; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2) sum += i;
            if (sum == i) min = sum;
        }

        System.out.println(sum == 0 ? -1 : sum + "\n" + min);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();
    }
}
