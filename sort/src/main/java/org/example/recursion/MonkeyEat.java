package org.example.recursion;

public class MonkeyEat
{
    public static void main(String[] args)
    {

        System.out.println(Eat(1));
    }
    public static int Eat(int day)
    {
        if (day==10)
        {
            return 1;
        }

        return (Eat(day+1)+1)*2;
    }
}
