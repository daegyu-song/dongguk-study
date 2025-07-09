import java.util.Arrays;
import java.util.Scanner;

public class BOJ2587 {

    static int sum;
    static int[] arr;

    public static void main(String[] args) {
        input();
        process();

        System.out.println(sum / arr.length);
        System.out.println(arr[arr.length / 2]);
    }

    static void process() {
        Arrays.sort(arr);
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
    }
}
