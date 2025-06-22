import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        sc.nextLine();
        String num2 = sc.nextLine();

        // Character.getNumericValue(): character -> int or char - '0', char - 48
        System.out.println(num1 * Character.getNumericValue(num2.charAt(2)));
        System.out.println(num1 * Character.getNumericValue(num2.charAt(1)));
        System.out.println(num1 * Character.getNumericValue(num2.charAt(0)));
        System.out.println(num1 * Integer.parseInt(num2));
    }
}