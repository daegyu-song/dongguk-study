import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[sc.nextInt() % 42]++;
        }

        for (int i : arr) {
            if (i > 0) count++;
        }

        System.out.println(count);
    }
}