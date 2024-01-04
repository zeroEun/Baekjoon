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

        int result = 0;
        for (String word : readList) {

            int checkCnt = 0;
            String[] strings = word.split("");
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < i; j++) {
                    String endStr = strings[i];
                    String str = strings[j];
                    String afterStr = strings[j+1];

                    if (!str.equals(afterStr) && endStr.equals(str)) checkCnt++;
                }
            }

            if (checkCnt == 0) result++;
        }

        System.out.println(result);
    }
}