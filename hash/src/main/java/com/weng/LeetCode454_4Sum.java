package com.weng;

import java.util.HashMap;

public class LeetCode454_4Sum
{
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        /*
         我们以存 AB 两数组之和为例。首先求出 A 和 B 任意两数之和 sumAB，以 sumAB 为 key，sumAB 出现的次数为 value，存入 hashmap 中。
         然后计算 C 和 D 中任意两数之和的相反数 sumCD，在 hashmap 中查找是否存在 key 为 sumCD。 算法时间复杂度为 O(n2)
         */
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int i : nums1)
        {
            for (int j : nums2)
            {
                hashMap.put(i+j,hashMap.getOrDefault(i+j,0)+1);
            }
        }
        int result=0;
        for (int i : nums3)
        {
            for (int j : nums4)
            {
                if (hashMap.containsKey(-(i+j)))
                {
                    result+=hashMap.get(-(i + j));
                }
            }
        }

        return result;
    }
}
