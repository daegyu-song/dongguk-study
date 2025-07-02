import java.util.Scanner;

public class BOJ10101 {

    static int[] triangle = new int[3];
    static int sum = 0;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {

        if (sum != 180) System.out.println("Error");
        else if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) System.out.println("Equilateral");
        else if (triangle[0] == triangle[1] || triangle[1] == triangle[2] || triangle[0] == triangle[2]) System.out.println("Isosceles");
        else System.out.println("Scalene");
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = sc.nextInt();
            sum += triangle[i];
        }
    }
}
