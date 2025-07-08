import java.util.Scanner;

public class BOJ1436 {

    static int N, count = 1, num = 666;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(num);
    }

    static void process() {
        while (count != N) {
            num++;
            if (String.valueOf(num).contains("666")) count++;
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
    }
}
