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
        String inputText = br.readLine();
        int cnt = Integer.parseInt(inputText);

        int dotCnt = 2;
        for (int i = 0; i < cnt; i++) {
            dotCnt =  dotCnt * 2 - 1;
        }

        System.out.println(dotCnt*dotCnt);
    }
}