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

        boolean way = true;
        int cnt = 0;
        int roofCnt = 1;
        int left = 0;
        int right = 0;

        while (cnt < idx) {
            left = 0;
            right = 0;
            int endCnt = roofCnt;
            for (int i = 0; i < roofCnt; i++) {
                if (cnt == idx) continue;
                if (way) {
                    left = endCnt--;
                    right += 1;
                } else {
                    left += 1;
                    right = endCnt--;
                }
                cnt++;
            }
            if (way) {
                way = false;
            } else {
                way = true;
            }
            roofCnt++;
        }

        System.out.println(left+"/"+right);
    }
}