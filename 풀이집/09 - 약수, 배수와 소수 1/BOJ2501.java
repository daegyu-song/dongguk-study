import java.util.Scanner;

public class BOJ2501 {

    static int a, b;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
                if (count == b) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
    }
}
