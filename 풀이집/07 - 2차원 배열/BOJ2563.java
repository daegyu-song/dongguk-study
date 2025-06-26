import java.util.Scanner;

public class BOJ2563 {

    static int[][] arr = new int[101][101];
    static int N, sum;

    public static void main(String[] args) {
        input();

        System.out.println(sum);
    }

    static void process(int column, int row) {
        for (int i = row; i < row + 10; i++) {
            for (int j = column; j < column + 10; j++) {
                if (!(arr[i][j] == 1)) {
                    arr[i][j] = 1;
                    sum++;
                }
            }
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            process(sc.nextInt(), sc.nextInt());
        }
    }
}
