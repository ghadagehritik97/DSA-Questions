package mixedQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestEleInList {

    public static void main(String[] args) {
        int [] integers={1,2,3,5,6,7,8,9,90};

        int num= Arrays.stream(integers)
                .max()
                .orElse(-1);
    }
}
