import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String input = br.readLine();
        int row = Integer.parseInt(input.split(" ")[0]);
        int col = Integer.parseInt(input.split(" ")[1]);

        List<String> readList = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            readList.add(br.readLine());
        }
        br.close();

        char wb = 'W';
        char bw = 'B';

        int min = -1;

        for (int j = 0; row - j >= 8; j++) {
            for (int i = 0; col - i >= 8; i++) {
                int case1 = 0;
                int case2 = 0;

                for (int jj = j; jj < (8 + j); jj++) {
                    if (jj % 2 == 0) {
                        wb = 'W';
                        bw = 'B';
                    }
                    if (jj % 2 == 1) {
                        wb = 'B';
                        bw = 'W';
                    }
                    
                    String rows = readList.get(jj);
                    for (int ii = i; ii < (8 + i); ii++) {
                        // 짝수
                        if (ii % 2 == 0) {
                            // case1 B로 시작
                            if (wb == rows.charAt(ii)) case1++;
                            // case2
                            if (bw == rows.charAt(ii)) case2++;
                        }
                        // 홀수
                        if (ii % 2 == 1) {
                            // case1
                            if (bw == rows.charAt(ii)) case1++;
                            // case2
                            if (wb == rows.charAt(ii)) case2++;
                        }
                    }
                }
                int caseMin = Math.min(case1, case2);
                if (min < 0) min = caseMin;
                if (min >= 0 && min > caseMin) min = caseMin;
            }
        }
        System.out.println(min);
    }
}