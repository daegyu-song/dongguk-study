import java.util.Scanner;

public class BOJ24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        long sum = 0;

        int check = 1;
        for (int i = 3; i <= count; i++) {
            sum += (long)(count - i + 1) * check;
            check++;
        }

        System.out.println(sum);
        System.out.println(3);
    }
}
