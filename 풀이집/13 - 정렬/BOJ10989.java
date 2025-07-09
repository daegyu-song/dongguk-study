import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989 {

    static int N;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        input();
        process();

        System.out.println(sb.toString());
    }

    static void process() {

        for (int i = 1; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                sb.append(i).append("\n");
            }
        }
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[10001];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
    }
}
