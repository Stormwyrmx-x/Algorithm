package org.example.recursion;

public class StairUp
{
    public static void main(String[] args)
    {
        System.out.println(Up(20));
    }
    public static int Up(int number)
    {
        if (number==1)
        {
            return 1;
        }
        if (number==2)
        {
            return 2;
        }
        if (number==3)
        {
            return 4;
        }
        return Up(number-1)+Up(number-2)+Up(number-3);
    }
}
