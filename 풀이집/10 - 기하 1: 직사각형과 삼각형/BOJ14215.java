import java.util.Arrays;
import java.util.Scanner;

public class BOJ14215 {

    static int[] triangle = new int[3];

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        Arrays.sort(triangle);

        if (triangle[2] >= triangle[0] + triangle[1]) triangle[2] = triangle[0] + triangle[1] - 1;

        System.out.println(triangle[0] + triangle[1] + triangle[2]);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = sc.nextInt();
        }
    }
}
