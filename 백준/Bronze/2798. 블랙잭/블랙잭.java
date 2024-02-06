import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cardArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int len = input[0];
        int sum = input[1];

        List<Integer> summArr = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    int tempSum = cardArr[i] + cardArr[j] + cardArr[k];
                    if (tempSum <= sum) summArr.add(tempSum);
                }
            }
        }

        Collections.sort(summArr, Collections.reverseOrder());
        System.out.println(summArr.get(0));

        br.close();
    }
}