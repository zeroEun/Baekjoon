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
        Double n = Double.parseDouble(br.readLine());

        // 2중 for문 수행횟수
        // 입력값이 500,000 까지 올 수 있어 제곱값 고려하여 결과 long 타입으로 받아야함 
        long result = (long) Math.pow(n, 2);

        System.out.println(result);
        System.out.println("2");

        br.close();
    }
}