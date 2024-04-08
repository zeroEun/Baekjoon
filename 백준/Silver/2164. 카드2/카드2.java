import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int cnt = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= cnt; i++) {
            deque.add(i);
        }

        while (deque.size() > 1) {
            deque.removeFirst();
            deque.add(deque.removeFirst());
        }

        System.out.println(deque.peek());
    }
}