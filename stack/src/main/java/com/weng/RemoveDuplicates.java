package com.weng;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringJoiner;

public class RemoveDuplicates
{

    public String removeDuplicates(String s)
    {

        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (!stack.isEmpty()&&stack.peek()==s.charAt(i))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (Character character : stack)
        {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

}
