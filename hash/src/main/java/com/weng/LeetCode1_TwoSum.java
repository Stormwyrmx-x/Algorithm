package com.weng;

import java.util.HashMap;

public class LeetCode1_TwoSum
{
    public int[] twoSum(int[] nums, int target) {
        //当我们需要查询一个元素是否出现过，或者一个元素是否在集合里的时候，就要第一时间想到哈希法
        HashMap<Integer,Integer>hashMap=new HashMap<>();//存储元素及其下标位置
        for (int i = 0; i < nums.length; i++)
        {
            if (hashMap.containsKey(target-nums[i]))
            {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }
}
