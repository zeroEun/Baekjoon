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
        int idx = Integer.parseInt(inputText);

        int rootCnt = 0;
        int startCnt = 1;
        int endCnt = 1;

        while (idx >= startCnt) {
            rootCnt++;
            startCnt = endCnt + 1;
            endCnt += rootCnt * 6;
        }

        System.out.println(rootCnt);
    }
}