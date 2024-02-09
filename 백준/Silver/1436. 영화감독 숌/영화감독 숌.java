import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        int input = Integer.parseInt(br.readLine());

        br.close();

        int cnt = 0;
        int i = 1;
        while (cnt != input) {
            String num = String.valueOf(i);
            if (num.contains("666")) cnt++;
            i++;
        }
        System.out.println(i-1);
    }
}