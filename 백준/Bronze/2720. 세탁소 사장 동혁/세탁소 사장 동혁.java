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

        List<String> readList = new ArrayList<>();

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            readList.add(br.readLine());
        }
        br.close();

        for (String word : readList) {
            StringBuffer changesBuffer = new StringBuffer();
            int changes = Integer.parseInt(word);

            int quarter = calcChanges(changes, 25);
            changes = changes - quarter * 25;
            changesBuffer.append(quarter + " ");

            int dime = calcChanges(changes, 10);
            changes = changes - dime * 10;
            changesBuffer.append(dime + " ");

            int nickel = calcChanges(changes, 5);
            changes = changes - nickel * 5;
            changesBuffer.append(nickel + " ");

            int penny = calcChanges(changes, 1);
            changesBuffer.append(penny);

            System.out.println(changesBuffer);
        }
    }

    public static int calcChanges(int changes, int coin) {
        int result;

        if (changes == 0) result = 0;
        else result = changes/coin;

        return result;
    }
}