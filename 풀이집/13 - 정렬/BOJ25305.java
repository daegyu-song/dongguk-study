import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ25305 {

    static int N, k;
    static Integer[] arr;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(arr[k - 1]);
    }

    static void process() {
        Arrays.sort(arr, Collections.reverseOrder());
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        k = sc.nextInt();
        arr = new Integer[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
