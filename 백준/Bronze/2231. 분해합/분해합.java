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

        for (int i = 1; i <= input; i++) {
            int sum = i;
            String[] numArr = String.valueOf(i).split("");
            for (int j = 0; j < numArr.length; j++) {
                sum += Integer.parseInt(numArr[j]);
            }
            if (sum == input) {
                System.out.println(String.join("", numArr));
                return;
            }
        }

        System.out.println(0);
    }
}