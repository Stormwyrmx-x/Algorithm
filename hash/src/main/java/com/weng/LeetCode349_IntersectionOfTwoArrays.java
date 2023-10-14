package com.weng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.IntFunction;

public class LeetCode349_IntersectionOfTwoArrays
{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1=new HashSet<>();
        HashSet<Integer> hashSet2=new HashSet<>();
        for (int i : nums1)
        {
            hashSet1.add(i);
        }
        for (int i : nums2)
        {
            if (hashSet1.contains(i))
            {
                hashSet2.add(i);
            }
        }
        int[] array = hashSet2.stream().mapToInt(value -> value).toArray();
        return array;
    }
}
