import java.util.Scanner;

public class BOJ2292 {

    static int N, room = 1, area = 6;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(room);
    }

    static void process() {
        int i = 1;
        while (true) {
            if (N <= i) break;
            i += area;
            area += 6;
            room++;
        }
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }
}
