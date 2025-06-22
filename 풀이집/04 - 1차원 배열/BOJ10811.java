import java.util.Scanner;

public class BOJ10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        while (M-- > 0) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            int j2 = j;
            for (int k = i; k <= (i + j) / 2; k++) {
                int tmp = arr[k];
                arr[k] = arr[j2];
                arr[j2--] = tmp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}