import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ14425 {

    static int N, M, answer = 0;
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        input();

        System.out.println(answer);
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 0);
        }

        for (int i = 0; i < M; i++) {
            if (map.containsKey(br.readLine())) answer++;
        }
    }
}
