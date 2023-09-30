package com.weng;

import java.util.*;

public class StringApi
{
    public static void main(String[] args)
    {
        String s="   asdadasdasd     ";
        String trim = s.trim();
        String strip = s.strip();
        System.out.println(trim.matches("\\w+"));
        System.out.println(trim);
        System.out.println(strip);


    }
}
