package com.weng;

import org.junit.Test;

import java.util.Scanner;

public class OperationalCharacterTest
{
    @Test
    public void testPlus()
    {
        System.out.println(-1000000000&20000000000L);
        int a = 1000000000,b=1000000000,c=1000000000;
        long d=(long)(a)/*+b+c*/;
        System.out.println(d==a);
//        System.out.println(d);
        byte a1=10;
        byte a2=10;
        char b1='a';
        int i = (a1 * b1);
        System.out.println(i);
        System.out.println();
        Byte a3=100;
        int a4=100;
        System.out.println('女'+"孩子好可爱捏"+true);
        Scanner in=new Scanner(System.in);
        in.hasNext();
    }
}
