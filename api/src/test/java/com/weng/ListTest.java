package com.weng;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListTest
{
    @Test
    public void fuck()
    {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>listTest=new ArrayList<>();
        listTest.add(1);
        listTest.add(2);
        list.add(listTest);
        List<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(list1.equals(listTest));
        System.out.println(list1.containsAll(listTest));
        System.out.println(list.contains(list1));
    }

}
