import java.util.Scanner;

public class BOJ3009 {

    static int[] x = new int[3], y = new int[3];
    static int x4, y4;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(x4 + " " + y4);
    }

    static void process() {
        if (x[0] == x[1]) x4 = x[2];
        else if (x[1] == x[2]) x4 = x[0];
        else x4 = x[1];

        if (y[0] == y[1]) y4 = y[2];
        else if (y[1] == y[2]) y4 = y[0];
        else y4 = y[1];
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
    }
}
