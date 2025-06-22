import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            max = Math.max(max, score);
            sum += score;
        }

        System.out.println((sum / max * 100) / N);
    }
}