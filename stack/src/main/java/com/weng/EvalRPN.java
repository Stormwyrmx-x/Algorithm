package com.weng;

import java.util.Stack;

public class EvalRPN
{
    public static void main(String[] args)
    {
        String[]tokens={"1","2","3","+","+","4","*"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens)
    {
        Stack<String>stack=new Stack<>();
        int i,j,sign;
        for (String token : tokens)
        {
            if (token.matches("-?\\d+"))
            {
                stack.push(token);
            }
            else
            {
                j=Integer.parseInt(stack.pop());
                i=Integer.parseInt(stack.pop());
                if (token.equals("+"))
                {
                    stack.push(String.valueOf(i+j));
                }
                if (token.equals("-"))
                {
                    stack.push(String.valueOf(i-j));
                }
                if (token.equals("*"))
                {
                    stack.push(String.valueOf(i*j));                }
                if (token.equals("/"))
                {
                    stack.push(String.valueOf(i/j));
                }
            }
        }
        return Integer.parseInt(stack.pop());


    }
}
