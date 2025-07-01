import java.util.Scanner;

public class BOJ5086 {

    static int a, b;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        if (b % a == 0) System.out.println("factor");
        else if (a % b == 0) System.out.println("multiple");
        else System.out.println("neither");
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == 0 && b == 0) break;
        }
    }
}
