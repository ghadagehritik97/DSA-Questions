package mixedQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumberInList {

    public static void main(String[] args) {
        List<Integer> numList=List.of(1,4,5,2,3,3,6,5,4);
        Set<Integer>numSet=new HashSet<>();
        Set<Integer>duplicateNumList=numList.stream()
                .filter(n->!numSet.add(n))
                .collect(Collectors.toSet());
        System.out.println(duplicateNumList);
    }
}
