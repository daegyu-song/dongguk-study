import java.util.Scanner;

public class BOJ1085 {

    static int x, y, w, h;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        int minX = Math.min(x, w - x);
        int minY = Math.min(y, h - y);

        System.out.println(Math.min(minX, minY));
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
    }
}
