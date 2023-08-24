package org.example.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class ArraysDemo
{
    public static void main(String[] args)
    {
//        int[] arr={25,34,12,48,3,97};
//        Integer[]arr2={25,34,12,48,3,97};
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.binarySearch(arr, 3));
        Collection<Integer> list = new ArrayList<>();


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(21);
        arrayList.add(23);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.sort((Integer o1, Integer o2) ->
        {
            return o1 - o2;
        });
//       arrayList.stream().forEach(integer -> System.out.println(integer));
        arrayList.forEach(integer ->
        {
            integer = 1;
        });
        System.out.println(arrayList);

        int[] a = new int[10];
        a[9] = 5;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 5));


    }

}
