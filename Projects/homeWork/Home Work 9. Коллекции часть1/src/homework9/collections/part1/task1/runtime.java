package homework9.collections.part1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class runtime {

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>(
                Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(markLength4(lst));
    }

    public static List<String> markLength4(List<String> lst) {
        ArrayList<String> answer = new ArrayList<String>();
        Iterator itr = lst.iterator();
        String curPos;
        while (itr.hasNext()) {
            curPos = itr.next().toString();
            if (curPos.length() == 4) {
                answer.add("****");
            }
            answer.add(curPos);
        }
        return answer;
    }
}
