package com.weng.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test
{
    public static void main(String[] args)
    {
//        List.of();
//        Arrays.asList();
        String[]strings= {"a","b"};
        int []a={1,2,3};
        Arrays.stream(strings).collect(Collectors.toList());
        List<int[]> a1 = List.of(a);
        List<String> strings1 = List.of(strings);
        List<int[]> ints = Arrays.asList(a);
        List<List<String>> lists = Arrays.asList(strings1);
        fuck(a);
        fuck(strings);
        System.out.println(a);
        System.out.println(strings);
//        Arrays.stream(strings).sorted()
        Arrays.stream(a).forEach(value -> System.out.println(value));
        System.out.println("=================");
        Stream.of(a).forEach(System.out::println);
        Stream.of(strings).forEach(s -> System.out.println(s));
//        ArrayList<String>arrayList1=new ArrayList<>();
//        ArrayList<String>arrayList=new ArrayList<>(Arrays.asList(strings));
//        Collections.addAll(arrayList,"am","b","c");
//        System.out.println(arrayList);
//        System.out.println(Arrays.toString(array));
//        Stream<String> stream = arrayList.stream();
//        Stream.of(1);
    }
    public static void fuck(int...a)
    {
        System.out.println(a[0]);
    }
    public static void fuck(String...a)
    {
        System.out.println(a[0]);
    }
}
