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

        String[] numbers = (inputText.split(" ")[0]).split("");
        int nSystem = Integer.parseInt(inputText.split(" ")[1]);

        int idx = 0;
        int sum = 0;
        for (int i = numbers.length -1; i >= 0; i--) {
            int num;
            if ("0,1,2,3,4,5,6,7,8,9".contains(numbers[i])) {
                num = Integer.parseInt(numbers[i]);
            } else {
                num = numbers[i].charAt(0) -55;
            }

            int val = (int) Math.pow(nSystem, idx);
            sum += num * val;
            idx++;
        }
        System.out.println(sum);
    }
}