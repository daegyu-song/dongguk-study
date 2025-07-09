import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ1427 {

    static String str;
    static String[] arr;

    public static void main(String[] args) {
        input();
        process();

        for (String s : arr) {
            System.out.print(s);
        }
    }

    static void process() {
        Arrays.sort(arr, Comparator.reverseOrder());
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        arr = str.split("");
    }
}
