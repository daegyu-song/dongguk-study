import java.util.Scanner;

public class BOJ10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(str.indexOf(c) + " ");
        }
    }
}