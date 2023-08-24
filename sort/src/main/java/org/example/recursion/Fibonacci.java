package org.example.recursion;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println(FibonacciRecursion(12));

    }
    public static int FibonacciRecursion(int number)
    {
        if (number==1||number==2)
        {
            return 1;
        }
        return FibonacciRecursion(number-1)+FibonacciRecursion(number-2);
    }
}
