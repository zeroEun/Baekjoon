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

        List<String> readList = new ArrayList<>();

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            readList.add(br.readLine());
        }
        br.close();

        ArrayDeque<String> deque = new ArrayDeque<>();
        StringJoiner stringJoiner = new StringJoiner("\n");

        for (String read : readList) {
            switch (read.charAt(0)) {
                case '1' :
                    deque.addFirst(read.split(" ")[1]);
                    break;
                case '2' :
                    deque.addLast(read.split(" ")[1]);
                    break;
                case '3' :
                    String firstOut = deque.pollFirst();

                    if (null == firstOut) stringJoiner.add("-1");
                    else stringJoiner.add(firstOut);
                    break;
                case '4' :
                    String lastOut = deque.pollLast();

                    if (null == lastOut) stringJoiner.add("-1");
                    else stringJoiner.add(lastOut);
                    break;
                case '5' :
                    stringJoiner.add(String.valueOf(deque.size()));
                    break;
                case '6' :
                    if (deque.isEmpty()) stringJoiner.add("1");
                    else stringJoiner.add("0");
                    break;
                case '7' :
                    if (!deque.isEmpty()) stringJoiner.add(deque.peekFirst());
                    else stringJoiner.add("-1");
                    break;
                case '8' :
                    if (!deque.isEmpty()) stringJoiner.add(deque.peekLast());
                    else stringJoiner.add("-1");
                    break;
            }
        }

        System.out.println(stringJoiner);
    }
}