import java.util.Scanner;

public class BOJ2566 {

    static int[][] arr = new int[10][10];
    static int max = Integer.MIN_VALUE;
    static int row, column;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(max);
        System.out.println(row + " " + column);
    }

    static void process() {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}