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
        int inputText = Integer.parseInt(br.readLine());

        int i = 0;
        int cnt = 0;
        for (; i < inputText; i++) {}
        cnt++;

        System.out.println(i);
        System.out.println(cnt);

        br.close();
    }
}