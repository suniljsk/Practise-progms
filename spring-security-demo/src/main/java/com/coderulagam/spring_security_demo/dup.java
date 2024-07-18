package com.coderulagam.spring_security_demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dup {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(13, 22, 56, 45, 33, 45, 78);
        l1.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

        String s="Programming";
        Map<Character, Long> count=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Count"+count);
        count.entrySet().stream().filter(entry->entry.getValue()>1).forEach(System.out::println);
        System.out.println("Count"+count);

    }
}
