import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int cnt = Integer.parseInt(br.readLine());

        StringJoiner stringJoiner = new StringJoiner("\n");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < cnt; i++) {
            String[] stringArr = (br.readLine()).split(" ");
            String command = stringArr[0];

            try {
                switch (command) {
                    case "push":
                        queue.add(Integer.parseInt(stringArr[1]));
                        break;
                    case "pop":
                        stringJoiner.add(String.valueOf(queue.removeFirst()));
                        break;
                    case "size":
                        stringJoiner.add(String.valueOf(queue.size()));
                        break;
                    case "empty":
                        if (queue.isEmpty()) {
                            stringJoiner.add("1");
                        } else {
                            stringJoiner.add("0");
                        }
                        break;
                    case "front":
                        stringJoiner.add(String.valueOf(queue.getFirst()));
                        break;
                    case "back":
                        stringJoiner.add(String.valueOf(queue.getLast()));
                        break;
                }
            } catch (Exception e) {
                stringJoiner.add("-1");
            }
        }
        br.close();
        System.out.println(stringJoiner);
    }
}