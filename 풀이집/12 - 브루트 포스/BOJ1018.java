import java.util.Scanner;

public class BOJ1018 {

    static int N, M, min = Integer.MAX_VALUE;
    static boolean[][] field;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(min);
    }

    static void process() {
        int count;
        boolean color;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                count = 0;
                color = field[i][j];
                for (int q = i; q < i + 8; q++) {
                    for (int k = j; k < j + 8; k++) {
                        if (field[q][k] != color) count++;
                        color = !color;
                    }
                    color = !color;
                }
                min = Math.min(min, Math.min(count, 64 - count));
            }
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        field = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') field[i][j] = true;
            }
        }
    }
}
