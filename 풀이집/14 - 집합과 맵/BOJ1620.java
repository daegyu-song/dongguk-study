import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1620 {

    static int N, M;
    static Map<String, Integer> map1 = new HashMap<>();
    static Map<Integer, String> map2 = new HashMap<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        input();

        System.out.println(sb.toString());
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map1.put(name, i);
            map2.put(i, name);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            try {
                int key = Integer.parseInt(str);
                sb.append(map2.get(key)).append("\n");
            } catch (Exception e) {
                sb.append(map1.get(str)).append("\n");
            }
        }
    }
}
