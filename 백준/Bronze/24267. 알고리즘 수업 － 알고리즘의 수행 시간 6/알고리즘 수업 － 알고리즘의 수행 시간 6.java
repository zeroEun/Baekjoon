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

        long sum = 0;
        for (long i = n - 1 ; i > 1; i--) {
            sum += (i * (i - 1)) / 2;
        }

        System.out.println(sum);
        System.out.println(3);

        br.close();
    }
}