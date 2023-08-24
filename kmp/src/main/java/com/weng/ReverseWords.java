package com.weng;

import java.util.*;

public class ReverseWords
{
    public static void main(String[] args)
    {
        String s=" a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s)
    {
        String trim = s.trim();
        String[] split = trim.split("\\s");
        List<String>s1 = Arrays.asList(split);
//        List<String>s2=new ArrayList<>();
//        Collections.addAll(s2,trim.split("\\s+"));
//        System.out.println(s2);
        Collections.reverse(s1);
//        StringJoiner stringJoiner=new StringJoiner(" ");
//        s1.forEach(stringJoiner::add);
//        return stringJoiner.toString();
        return String.join(" ",s1);
    }
}
