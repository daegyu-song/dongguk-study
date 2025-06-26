import java.util.Scanner;

public class BOJ2745 {

    static String N;
    static int B, answer;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(answer);
    }

    static void process() {
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') answer += (int)(Math.pow(B, N.length() - i - 1) * (N.charAt(i) - 55));
            else answer += (int)(Math.pow(B, N.length() -i -1)) * Character.getNumericValue(N.charAt(i));
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.next();
        B = sc.nextInt();
    }
}