package org.example;

public class LeetCode125_IsPalindrome
{
    //验证回文串
    public static boolean isPalindrome(String s) {
        String result = s.replace(" ","").toLowerCase();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < result.length(); i++)
        {
            if (Character.isLetterOrDigit(result.charAt(i)))
            {
                stringBuilder.append(result.charAt(i));
            }
        }
        StringBuilder reverse = new StringBuilder(stringBuilder).reverse();
        return stringBuilder.toString().equals(reverse.toString());
    }

    public static void main(String[] args)
    {
        String s="race e car";
        System.out.println(isPalindrome(s));
    }
}
