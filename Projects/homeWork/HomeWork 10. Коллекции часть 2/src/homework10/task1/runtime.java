package homework10.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class runtime {

    public static void main(String[] args) {
        String testText = "Word word word try try easy easy easy eaSy alone unique";
        System.out.println(getWordsCount(testText).toString());
    }

    public static HashMap<String, Integer> getWordsCount(String text) {
        String[] wordList = text.split("\\s+");
        HashMap<String, Integer> hashMap = new HashMap<>();
        List list = new ArrayList();
        int acc;
        for (int i = 0; i < wordList.length; i++) {
            list.add(wordList[i]);
            acc = Collections.frequency(list, wordList[i]);
            hashMap.put(wordList[i], acc);
        }
        return hashMap;
    }
}
