import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String input = br.readLine();
        br.close();

        int idx = 0;
        String[] strArry = input.split(" ");
        int a = Integer.parseInt(strArry[idx++]);
        int b = Integer.parseInt(strArry[idx++]);
        int c = Integer.parseInt(strArry[idx++]);
        int d = Integer.parseInt(strArry[idx++]);
        int e = Integer.parseInt(strArry[idx++]);
        int f = Integer.parseInt(strArry[idx++]);

        int x = -999;
        for (; x <= 999; x++) {
            if (0 == b) {
                if (a * x == c) {
                    int y =  (f - d * x) / e;
                    System.out.println(x + " " + y);
                    return;
                }
            } else {
                if (0 == (c - a * x) % b) {
                    int y = (c - a * x) / b;

                    if (d*x + e*y == f) {
                        System.out.println(x + " " + y);
                    }
                }
            }
        }
    }
}