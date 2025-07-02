import java.util.Scanner;

public class BOJ24265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        long sum = 0;

        for (int i = 1; i < count; i++) {
            sum += i;
        }

        System.out.println(sum);
        System.out.println(2);
    }
}
