package com.weng;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest
{
    @Test
    public void testFuck()
    {
        Set<Integer>set=new HashSet<>();
        int []nums={10,5,8,10};
        set.add(nums[0]);
        System.out.println(set.contains(nums[3]));
    }
}
