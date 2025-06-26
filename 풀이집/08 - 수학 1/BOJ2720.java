import java.util.Scanner;

public class BOJ2720 {

    static int T;
    static StringBuilder sb;

    public static void main(String[] args) {
        input();
    }

    static void process(int money) {
        sb = new StringBuilder();

        sb.append(money / 25).append(" ");
        money %= 25;
        sb.append(money / 10).append(" ");
        money %= 10;
        sb.append(money / 5).append(" ");
        money %= 5;
        sb.append(money).append(" ");

        System.out.println(sb.toString());
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        while (T-- > 0) {
            process(sc.nextInt());
        }
    }
}
