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

        double A = Double.parseDouble(inputText.split(" ")[0]);
        double B = Double.parseDouble(inputText.split(" ")[1]);
        double V = Double.parseDouble(inputText.split(" ")[2]);

        int j = (int) Math.ceil((V - A) / (A - B) + 1);
        System.out.println(j);
    }
}