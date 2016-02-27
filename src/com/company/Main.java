package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Arrays.asList("a1","a2","a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
        Stream.of("a1","a2","a3")
                .findFirst()
                .ifPresent(System.out::println);
        IntStream.range(1,4)
                .forEach(System.out::println);
        Arrays.stream(new int[] {1,2,3})
                .map(n->2*n+1)
                .average()
                .ifPresent(System.out::println);
        Stream.of("a1","a2","a3")
                .map(s->s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
        IntStream.range(1,4)
                .mapToObj(i->"a" + i)
                .forEach(System.out::println);
       /* Stream<Date> stream = Stream.generate(()->{return new Date();});
        stream.forEach(p-> System.out.println(p));*/ //вывод даты


        System.out.println();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNumbersList);


    }
}
