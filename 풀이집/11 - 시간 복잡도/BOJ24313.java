import java.util.Scanner;

public class BOJ24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        while (n0 <= 100) {
            if (a1 * n0 + a0 > c * n0) {
                System.out.println(0);
                return;
            }
            n0++;
        }

        System.out.println(1);
    }
}
