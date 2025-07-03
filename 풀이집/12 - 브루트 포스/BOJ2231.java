import java.util.Scanner;

public class BOJ2231 {

    static int N;

    public static void main(String[] args) {
        input();
        process();
    }

    static void process() {
        int num = 0;

        while (num++ < N) {
            int sum = num;
            String numToString = String.valueOf(num);

            for (int i = 0; i < numToString.length(); i++) {
                sum += Character.getNumericValue(numToString.charAt(i));
            }

            if (sum == N) {
                System.out.println(num);
                return;
            }
        }

        System.out.println(0);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
    }
}
