package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProblems {

    static void main() {
        String s="Infosys";

//        Map<String,Long> countMap= Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(countMap);

        List<Integer> intList=List.of(11,21,31,10,20,30,40,50,60);

//        Set<Integer> seen=new HashSet<>();
//        intList.stream().filter(n-> !seen.add(n)).toList().forEach(System.out::println);

        Integer secHigh=intList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
//        System.out.println(secHigh);

//        intList.stream().filter(n->String.valueOf(n).startsWith("1")).toList().forEach(System.out::println);
        Map<Boolean,List<Integer>>evenOddMap=intList.stream().collect(Collectors.partitioningBy(n-> n%2==0));
        System.out.println(evenOddMap.get(false));
        List<String> words = Arrays.asList("Java", "SpringBoot", "Microservices", "AWS");
        String str=words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
//        List<Integer>nums=List.of(1,2,2,3,3,3);
        int nums[]={1,2,2,3,3,3};
//        Map<Integer,Long>countMap=Arrays.stream(nums).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
