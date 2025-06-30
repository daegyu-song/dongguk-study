import java.util.Scanner;

public class BOJ2869 {

    static int A, B, V, date = 0;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(date);
    }

    static void process() {
        date = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) date++;
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        V = sc.nextInt();
    }
}
