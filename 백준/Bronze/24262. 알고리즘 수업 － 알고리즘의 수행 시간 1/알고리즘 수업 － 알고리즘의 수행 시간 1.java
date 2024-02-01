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

        // 입력값에 상관없이 무조건 한번만 수행하므로 수행횟수는 1
        System.out.println("1");
        System.out.println("0");

        br.close();
    }
}