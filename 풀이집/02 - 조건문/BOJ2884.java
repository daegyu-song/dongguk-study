import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M - 45 < 0) {
            M = 60 + M - 45;
            if (H - 1 < 0) H = 23;
            else H -= 1;
        } else M -= 45;

        System.out.println(H + " " + M);
    }
}