import java.util.Scanner;

public class BOJ2903 {

    static int N, dot;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(dot);
    }

    static void process() {
        int count = (int)Math.pow(4, N);
        int length = (int)Math.pow(2, N);
        dot = count * 4;
        dot -= (1 * (length - 1) * 4) + (3 * (length - 1) * (length - 1));
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }
}
