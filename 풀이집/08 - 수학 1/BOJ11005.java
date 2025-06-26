import java.util.Scanner;

public class BOJ11005 {

    static int N, B;
    static String answer = "";

    public static void main(String[] args) {
        input();
        process();

        System.out.println(answer);
    }

    static void process() {
        while (N > 0) {
            if (N % B >= 10 && N % B <= 35) answer = (char)(N % B + 55) + answer;
            else answer = N % B + answer;
            N /= B;
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        B = sc.nextInt();
    }
}
