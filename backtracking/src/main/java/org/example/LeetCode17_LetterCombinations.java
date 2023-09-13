package org.example;

import java.util.*;

public class LeetCode17_LetterCombinations
{
    List<String>result=new ArrayList<>();
    StringBuilder path=new StringBuilder();
    Map<Character,String>map=new HashMap<>();

    public  List<String> letterCombinations(String digits) {
        if (Objects.equals(digits, ""))
        {
            return result;
        }

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtracking(0,digits);
        return result;
    }

    public  void backtracking(int index, String digits)
    {
        if (path.length() == digits.length())
        {
            result.add(path.toString());
            return;
        }
        for (int i = 0; i < map.get(digits.charAt(index)).length(); i++)
        {
            path.append(map.get(digits.charAt(index)).charAt(i));
            backtracking(index + 1, digits);//index表示遍历到digits中的哪个位置了
            path.deleteCharAt(path.length() - 1);
        }
    }
}
