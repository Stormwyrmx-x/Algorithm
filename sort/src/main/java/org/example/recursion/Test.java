package org.example.recursion;

public class Test
{
    public static void main(String[] args)
    {
        int number=100;
        System.out.println(getNum(number));
        System.out.println(getFactorial(7));
        System.out.println(getFibonacci(10));


    }

    private static int getNum(int number)
    {
        if (number>1)
        {
            return number+getNum(number-1);
        }
        return number;

    }

    public static int getFactorial(int number)
    {
        if (number==2)
        {
            return 2;
        }

        return number*getFactorial(number-1);
    }

    public static int getFibonacci(int number)
    {
        if (number==1||number==2)
        {
            return 1;
        }
        return getFibonacci(number-1)+getFibonacci(number-2);
    }
}
