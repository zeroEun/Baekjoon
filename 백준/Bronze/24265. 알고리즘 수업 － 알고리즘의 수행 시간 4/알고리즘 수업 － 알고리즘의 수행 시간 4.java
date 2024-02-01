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
        int n = Integer.parseInt(br.readLine());

        Long result = 0L;
        for (int i = 1; i < n; i++) {
            result += i;
        }

        System.out.println(result);
        System.out.println("2");

        br.close();
    }
}