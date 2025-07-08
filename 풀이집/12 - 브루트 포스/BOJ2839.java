import java.util.Scanner;

public class BOJ2839 {

    static int N, num3 = 0, num5 = 0;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        for (int i = N / 5; i >= 0; i--) {
            if ((N - 5 * i) % 3 == 0) {
                num3 = (N - 5 * i) / 3;
                num5 = i;

                System.out.println(num3 + num5);
                return;
            }
        }

        System.out.println(-1);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
    }
}
