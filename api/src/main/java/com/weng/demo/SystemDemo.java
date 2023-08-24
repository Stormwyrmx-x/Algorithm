package com.weng.demo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SystemDemo
{

    public static void main(String[] args)
    {
        int []fuck1=new int[10];
        for (int i = 0; i < 10; i++)
        {
            fuck1[i]=1;
        }
        int []fuck2=new int[10];
        ArrayList<Integer>fuck3 = new ArrayList<>();
        fuck3.stream().collect(Collectors.toList());
        System.arraycopy(fuck1,0,fuck2,0,10);
        System.out.println(fuck2.toString());
        System.exit(0);

    }
}
