package com.weng.demo;

import java.util.Scanner;

public class IntegerDemo
{
    public static void main(String[] args)
    {
//        Integer i3=10;
//        Integer i1=12;
//        Integer i2=i1+i3;//先拆，再计算，再装
//        System.out.println(i2);
//        System.out.println(1+34);
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        int i = Integer.parseInt(s);
        Integer integer = Integer.valueOf(1);
        System.out.println(integer);
        System.out.println(i);
    }
}
