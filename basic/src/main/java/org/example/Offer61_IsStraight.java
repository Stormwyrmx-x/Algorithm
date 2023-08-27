package org.example;

import java.util.Arrays;

public class Offer61_IsStraight
{
    //todo 集合 Set + 遍历
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker=0;
        for (int i = 0; i < 4; i++)
        {
            if (nums[i]==0)
            {
                joker++;
            }
            else if (nums[i+1]==nums[i])
            {
                return false;
            }
        }
        return nums[4]-nums[joker]<5;

    }
}
