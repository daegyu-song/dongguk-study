import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse().toString().equals(str) ? 1 : 0);
    }
}