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

        char[] stringArray = inputText.toUpperCase().toCharArray();
        Map<Character, Integer> charCntMap = new HashMap<>();

        for (char charString : stringArray) {
            if (charCntMap.containsKey(charString)) {
                int cnt = charCntMap.get(charString);
                charCntMap.put(charString, ++cnt);
            } else {
                charCntMap.put(charString, 1);
            }
        }

        List<Character> keySetList = new ArrayList<>(charCntMap.keySet());
        Collections.sort(keySetList, (o1, o2) -> charCntMap.get(o2).compareTo(charCntMap.get(o1)));

        String result = "?";
        if (keySetList.size() > 0) result = String.valueOf(keySetList.get(0));
        if (keySetList.size() > 1) {
            if (charCntMap.get(keySetList.get(0)).equals(charCntMap.get(keySetList.get(1)))) result = "?";
        }

        System.out.println(result);
    }
}