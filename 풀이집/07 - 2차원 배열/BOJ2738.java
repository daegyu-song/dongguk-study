import java.util.Scanner;

public class BOJ2738 {

    static int N, M;
    static int[][] A, B;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print( (A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }
    }

    static void createArray(int[][] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void input() {
        N = sc.nextInt();
        M = sc.nextInt();

        A = new int[N][M];
        createArray(A);
        B = new int[N][M];
        createArray(B);
    }
}