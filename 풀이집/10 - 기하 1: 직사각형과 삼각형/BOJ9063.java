import java.util.Arrays;
import java.util.Scanner;

public class BOJ9063 {

    static int N;
    static int[] x, y;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println((x[x.length - 1] - x[0]) * (y[y.length - 1] - y[0]));
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        x = new int[N];
        y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
    }
}
