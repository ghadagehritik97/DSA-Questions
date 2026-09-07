package basicHashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};

        Map<Integer,Integer>countMap=new HashMap<>();
        for(int i:arr){
            countMap.put(i,countMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:countMap.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        int a=Integer.MAX_VALUE;
    }

}
