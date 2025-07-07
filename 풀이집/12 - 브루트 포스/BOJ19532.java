import java.util.Scanner;

public class BOJ19532 {

    static int a, b, c, d, e, f;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a * i + b * j == c && d * i + e * j == f) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
    }
}
