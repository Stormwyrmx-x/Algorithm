package org.example.sort;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GradeSort
{
    public static void main(String[] args)
    {

        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        Map<Long, Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            map.put(in.nextLong(),in.nextInt());
        }
//        Collection<Integer> values = map.values();

        Set<Map.Entry<Long, Integer>> entrySet = map.entrySet();
        List<Map.Entry<Long, Integer>> collect = entrySet.stream().filter(longIntegerEntry -> longIntegerEntry.getValue() >= 60).sorted((o1, o2) ->
        {
            if (o1.getValue()!=o2.getValue())
            {
                return o2.getValue()- o1.getValue();
            }
            else
            {
                return Math.toIntExact(o1.getKey() - o2.getKey());
            }
        }).collect(Collectors.toList());


//        List<Map.Entry<Integer, Integer>> collect = new ArrayList<>(entrySet.stream().toList());
//        collect.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Long, Integer> entry : collect)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        /**
//         * 1.增强for 2.迭代器 3.lambda
//         */
//        for (Map.Entry<Integer, Integer> entry : entrySet)
//        {
//            System.out.println(entry.getKey()+"="+entry.getValue());
//        }
//        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
//        entrySet.forEach(integerIntegerEntry -> System.out.println(integerIntegerEntry.getKey()+"="+integerIntegerEntry.getValue()));
//
//        map.forEach((integer, integer2) -> System.out.println(integer+"="+integer2));

//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        ArrayList<Integer>arrayList=new ArrayList<>();
//        System.out.println(map);
//        Set<Integer> keySet = map.keySet();
//        /**
//         * 1.增强for 2.迭代器 3.lambda
//         */
//        for (Integer integer : keySet)
//        {
//            System.out.println(integer);
//        }
//        Iterator<Integer> iterator = keySet.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
//        keySet.forEach(System.out::println);

    }
}
