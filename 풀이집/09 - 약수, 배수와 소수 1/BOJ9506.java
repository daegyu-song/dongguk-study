import java.util.Scanner;

public class BOJ9506 {

    static int n;
    static StringBuilder sb;

    public static void main(String[] args) {
        input();
    }

    static void process() {
        sb = new StringBuilder();
        sb.append(n).append(" = ");

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            for (int i = 1; i < n; i++) {
                if (n % i ==0) {
                    if (i == 1) {
                        sb.append(i);
                    } else {
                        sb.append(" ").append("+").append(" ").append(i);
                    }
                }
            }
            System.out.println(sb.toString());
        } else {
            System.out.println(n + " is NOT perfect.");
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            n = sc.nextInt();

            if (n == -1) break;

            process();
        }
    }
}
