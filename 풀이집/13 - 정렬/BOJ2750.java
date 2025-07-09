import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {

    static int N;
    static int[] arr;

    public static void main(String[] args) {
        input();
        process();

        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void process() {
        Arrays.sort(arr);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
