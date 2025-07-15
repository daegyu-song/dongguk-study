import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ10816 {

    static int N, M;
    static Map<Integer, Integer> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        input();

        System.out.println(sb.toString());
    }

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            if (map.containsKey(num)) sb.append(map.get(num)).append(" ");
            else sb.append(0).append(" ");
        }
    }
}
