package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode1979_FindGCD
{
    //求最大公因（约）数，辗转相除法:gcd(max,min)=gcd(min,max%min)
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        return gcd(max,min);
//        int result=1;
//        for (int i = 2; i <= min; i++)
//        {
//            if (min%i==0&&max%i==0)
//            {
//                result=i;
//            }
//        }
//        return result;
    }
    public int gcd(int max,int min)
    {
        if (min==0)
        {
            return max;
        }
        return gcd(min,max%min);
    }
}
