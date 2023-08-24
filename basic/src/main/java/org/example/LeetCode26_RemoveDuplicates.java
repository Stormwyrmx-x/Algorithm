package org.example;

import java.util.Arrays;

public class LeetCode26_RemoveDuplicates
{
    //双指针法
    public int removeDuplicates(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i==nums.length-1)
            {
                nums[count]=nums[i];
                count++;
                break;
            }
            if (nums[i]<nums[i+1])
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;

    }
}
