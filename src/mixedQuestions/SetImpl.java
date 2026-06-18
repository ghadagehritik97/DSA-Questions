package mixedQuestions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SetImpl {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("banana");
        set.add("apple");
        set.add("orange");
        System.out.println(set);

        Map<String,Integer> sameMap=new ConcurrentHashMap<>();
        sameMap.put("banana",2);
        sameMap.put("apple",1);
        sameMap.put("orange",3);
        System.out.println(sameMap);

    }
}
