import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int length = Integer.parseInt(br.readLine());
        String[] rows = br.readLine().split(" ");

        int cnt = 1;
        Stack<Integer> waiting = new Stack<>();

        for (int i = 0; i < rows.length; i++) {
            int row = Integer.parseInt(rows[i]);

            if (row == cnt) {
                cnt++;
                continue;
            }

            if (!waiting.isEmpty() && cnt == waiting.peek()) {
                waiting.pop();
                cnt++;
                i--;
                continue;
            }
            waiting.push(row);
        }

        while (!waiting.isEmpty()) {
            if (cnt == waiting.pop()) {
                cnt++;
            } else {
                System.out.println("Sad");
                break;
            }
        }

        if (waiting.isEmpty()) System.out.println("Nice");

        br.close();
    }
}