package com.weng.demo;

import com.weng.entity.Girl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo
{
    double a=10;

    public static void main(String[] args)
    {
        double b=10;
        int [] animals=new int[4];
        System.out.println(animals);
        int [] girls={18,19,17};
        int [] boys=new int[]{21,22};
        System.out.println(boys);
        System.out.println(Arrays.toString(girls));

        List<Integer>fuck=new ArrayList<>();
        fuck.add(1);
        fuck.add(1);
        fuck.add(1);
        System.out.println(fuck);

    }
}
