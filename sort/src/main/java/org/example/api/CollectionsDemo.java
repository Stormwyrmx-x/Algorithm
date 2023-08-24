package org.example.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo
{
    public static void main(String[] args)
    {
        ArrayList<String>arrayList=new ArrayList<>();
        Collections.addAll(arrayList,"aaaa","bbb","ccccc","dddddd");
//        Collections.shuffle(arrayList);
//        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, "bbb"));
        Collections.sort(arrayList,(o1, o2) -> o1.length()-o2.length());
        System.out.println(arrayList);


        ArrayList<Integer>integerArrayList=new ArrayList<>();
        Collections.addAll(integerArrayList,1,6,5,9,10,2);
        System.out.println(Collections.binarySearch(integerArrayList, 2));
        Integer max = Collections.max(integerArrayList,(o1, o2) -> o1-o2);
        System.out.println(max);
    }
}
