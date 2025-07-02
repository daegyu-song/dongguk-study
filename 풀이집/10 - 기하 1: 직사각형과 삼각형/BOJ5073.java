import java.util.Arrays;
import java.util.Scanner;

public class BOJ5073 {

    static int[] triangle = new int[3];

    public static void main(String[] args) {
        input();
    }

    static void process() {
        Arrays.sort(triangle);

        if (triangle[0] + triangle[1] <= triangle[2]) System.out.println("Invalid");
        else if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) System.out.println("Equilateral");
        else if (triangle[0] != triangle[1] && triangle[1] != triangle[2] && triangle[0] != triangle[2]) System.out.println("Scalene");
        else System.out.println("Isosceles");
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            for (int i = 0; i < triangle.length; i++) {
                triangle[i] = sc.nextInt();
            }

            if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) break;

            process();
        }


    }
}
