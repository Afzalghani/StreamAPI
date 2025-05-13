package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterEvenNumber {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(33);
        //Print All of It's Elment
        list.forEach(System.out::println);// Or you can add Stream Here
        List<Integer> ans = list.stream().filter(x-> x%2==0).collect(Collectors.toList());
        System.out.println(ans);
    }
}