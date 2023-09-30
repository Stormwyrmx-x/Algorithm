package com.weng;

public class Offer5_ReplaceSpace
{
    public static String replaceSpace(String s)
    {
        StringBuilder stringBuilder=new StringBuilder();
        for (char c : s.toCharArray())
        {
            if (c==' ')
            {
                stringBuilder.append("20%");
            }
            else
            {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
//        for (int i = 0; i < stringBuilder.length(); i++)
//        {
//            if (stringBuilder.charAt(i)==' ')
//            {
//                stringBuilder.deleteCharAt(i);
//                stringBuilder.insert(i,"20%");
//                i+=2;
//            }
//        }
//        return stringBuilder.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(replaceSpace("we are cha "));
    }
}
