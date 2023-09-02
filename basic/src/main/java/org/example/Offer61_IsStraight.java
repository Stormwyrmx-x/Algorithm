package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Offer61_IsStraight
{
    /**
     * 根据题意，此 5 张牌是顺子的 充分条件 如下：
     * 除大小王外，所有牌 无重复 ；
     * 设此 5 张牌中最大的牌为 max ，最小的牌为 min （大小王除外），则需满足：
     * ★ max-min<5
     * @param nums
     * @return
     */
    public boolean isStraight(int[] nums) {
        /**
         * 排序+遍历
         */
//        Arrays.sort(nums);
//        int joker=0;
//        for (int i = 0; i < 4; i++)
//        {
//            if (nums[i]==0)
//            {
//                joker++;
//            }
//            else if (nums[i+1]==nums[i])
//            {
//                return false;
//            }
//        }
//        return nums[4]-nums[joker]<5;

        /**
         * set集合+遍历
         */
        Set<Integer>set=new HashSet<>();
        for (int num : nums)
        {
            if (num==0)
            {
                continue;
            }
            else if (set.contains(num))
            {
                return false;
            }
            else
            {
                set.add(num);
            }
        }
//        if (set.isEmpty())
//        {
//            return false;
//        }
        int max = 0;
        int min = 14;
        for (Integer integer : set)
        {
            max=Math.max(max,integer);
            min=Math.min(min,integer);
        }
        return max-min<5;
    }
}
