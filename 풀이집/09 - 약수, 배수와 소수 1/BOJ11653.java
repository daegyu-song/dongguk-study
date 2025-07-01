import java.util.Scanner;

public class BOJ11653 {

    static int N;
    static StringBuilder sb;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(sb.toString());
    }

    static void process() {
        sb = new StringBuilder();
        while (N > 1) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    N /= i;
                    sb.append(i).append("\n");
                    break;
                }
            }
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
    }
}
