package mixedQuestions;
import java.util.List;

public class findSquareOfEvenNumbersFromArray {

    public static void main(String[] args) {
       List<Integer>integers=List.of(1,2,3,4,5,6,7,8,9,10);
       List<Integer> square = integers.stream()
               .filter(num->num % 2 == 0)
               .map(i->i*i)
               .toList();
       
        System.out.println("Squares of even numbers: " + square);
    }


}
