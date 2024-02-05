import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String[] input =  br.readLine().split("");

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (Integer.parseInt(input[i]) < Integer.parseInt(input[j])) {
                    String temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }

        System.out.println(String.join("", input));

        br.close();
    }
}