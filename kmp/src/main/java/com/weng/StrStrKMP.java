package com.weng;

import java.util.ArrayList;

public class StrStrKMP
{
    static ArrayList<String>arrayList=new ArrayList<>();

    public static void main(String[] args)
    {
        arrayList.add(0,"123");
        arrayList.add(1,"1234");
        arrayList.add(2,"12345");
        arrayList.add(3,"321");
        System.out.println(arrayList.indexOf("1234"));
    }
}
