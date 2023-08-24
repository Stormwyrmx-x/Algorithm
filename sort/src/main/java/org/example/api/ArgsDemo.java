package org.example.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArgsDemo
{
    public static void main(String[] args)
    {
        int num = getNum(1, 2, 3, 4, 5);
        System.out.println(num);
    }
    public static int getNum(int ... args)
    {
        int sum = 0;
        for (int arg : args)
        {
            sum+=arg;
        }
        System.out.println(Arrays.toString(args));
        return sum;
    }
}
