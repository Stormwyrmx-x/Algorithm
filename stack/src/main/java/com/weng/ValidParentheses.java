package com.weng;

import java.util.Stack;

public class ValidParentheses
{
    public boolean isValid(String s) {
//        char[] charArray = s.toCharArray();
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i)=='(')
            {
                stack.push(')');
            }
            else if (s.charAt(i)=='[')
            {
                stack.push(']');
            }
            else if (s.charAt(i)=='{')
            {
                stack.push('}');
            }
            else if (!stack.isEmpty()&&stack.peek()==s.charAt(i))
            {
                stack.pop();
            }
            else
            {
                return false;
            }
        }






//        for (int i = 0; i < charArray.length; i++)
//        {
//            if (charArray[i]=='('||charArray[i]=='['||charArray[i]=='{')
//            {
//                stack.push(charArray[i]);
//            }
//            if (charArray[i]==')')
//            {
//                if (!stack.isEmpty()&&stack.peek()=='(')
//                {
//                    stack.pop();
//                }
//                else
//                {
//                    return false;
//                }
//            }
//            if (charArray[i]==']')
//            {
//                if (!stack.isEmpty()&&stack.peek()=='[')
//                {
//                    stack.pop();
//                }
//                else
//                {
//                    return false;
//                }
//            }
//            if (charArray[i]=='}')
//            {
//                if ( !stack.isEmpty()&&stack.peek()=='{')
//                {
//                    stack.pop();
//                }
//                else
//                {
//                   return false;
//                }
//            }
//        }


        return stack.isEmpty();

    }
}
