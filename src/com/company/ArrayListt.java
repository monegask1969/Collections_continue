package com.company;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Ukrainian_IT_School on 27.02.2016.
 */
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> memberNames = new ArrayList<>();

        memberNames.add("Akbar");
        memberNames.add("Leonid");
        memberNames.add("Leha");
        memberNames.add("Aleksei");

       /* memberNames.stream().filter((s)->s.startsWith("A"))
                .forEach(System.out::println);
        boolean matchedResult = memberNames.stream()
                .anyMatch((s)->s.startsWith("A"));
        System.out.println(matchedResult);
        matchedResult = memberNames.stream()
                .allMatch((s)->s.startsWith("A"));
        System.out.println(matchedResult);
        matchedResult = memberNames.stream()
                .noneMatch((s)->s.startsWith("A"));
        System.out.println(matchedResult);*/

        Stream.of("d2","a2","b1","b3","c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s1 -> {
                    System.out.println("anyMatch:" + s1);
                    return s1.startsWith("A");
                });

        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2)->s1 + "#" + s2);
        reduced.ifPresent(System.out::println);

        List<Integer> numbers = Arrays.asList(3,2,2,4,7,3,5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x)->x).summaryStatistics();

        System.out.println("Highest number ni List: " + stats.getMax());
        System.out.println("Lowest number in List: " + stats.getMin());
        System.out.println("Sum of all numbers: " + stats.getSum());
        System.out.println("Average of all numbers: " + stats.getAverage());

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
