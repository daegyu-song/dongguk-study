import java.io.*;
import java.util.*;

public class BOJ10814 {

    static int N;
    static List<User> list = new ArrayList<>();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        input();
        process();

        for (User u : list) {
            System.out.println(u.age + " " + u.name);
        }
    }

    static void process() {
        list.sort(Comparator.comparingInt((User u) -> u.age)
                .thenComparingInt(u -> u.sequence));
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list.add(new User(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
    }
}

class User {
    static int count = 0;

    int age;
    String name;
    int sequence;

    User(int age, String name) {
        this.age = age;
        this.name = name;
        this.sequence = count++;
    }
}
