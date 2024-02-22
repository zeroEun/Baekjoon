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

        int five = Math.floorDiv(input, 5);
        for (int i = five; i >= 0; i--) {

            int three = Math.floorDiv(input, 3);
            for (int j = 0; j <= three; j++) {

                if(input - (i * 5) - (j * 3) == 0) {
                    System.out.println(i + j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}