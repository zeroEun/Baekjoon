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

        int cnt = Integer.parseInt(br.readLine());
        String[] readList = br.readLine().split(" ");

        br.close();

        ArrayDeque<Map> deque = new ArrayDeque<>();
        StringJoiner stringJoiner = new StringJoiner(" ");

        for (int i = 0; i < readList.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            map.put("seq", i + 1);
            map.put("num", Integer.parseInt(readList[i]));
            deque.add(map);
        }


        int num = 0;
        while (!deque.isEmpty()) {

            if (num < 0) {
                for (int i = 1; i < Math.abs(num) + 1; i++){
                    deque.addFirst(deque.pollLast());
                }
            }

            if (num > 0) {
                for (int i = 1; i < Math.abs(num); i++){
                    deque.addLast(deque.pollFirst());
                }
            }

            Map poll = deque.pollFirst();
            stringJoiner.add(String.valueOf(poll.get("seq")));
            num = (int) poll.get("num");
        }

        System.out.println(stringJoiner);
    }
}