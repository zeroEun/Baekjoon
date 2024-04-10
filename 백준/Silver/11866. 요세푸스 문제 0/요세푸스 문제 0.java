import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] read = (br.readLine()).split(" ");
        int people = Integer.parseInt(read[0]);
        int num = Integer.parseInt(read[1]);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= people; i++) {
            deque.add(i);
        }

        StringJoiner stringJoiner = new StringJoiner(", ");

        while (!deque.isEmpty()) {

            int temp = deque.size() - (deque.size() - num);
            for (int i = 0; i < temp; i++) {
                deque.addLast(deque.removeFirst());
            }

            stringJoiner.add(String.valueOf(deque.removeLast()));
        }

        System.out.println("<" + stringJoiner + ">");
    }
}