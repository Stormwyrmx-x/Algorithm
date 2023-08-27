package org.example;

import java.util.Arrays;

public class LeetCode1984_MinimumDifference
{
    //学生分数的最小插值，滑动窗口遍历
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int result=nums[k-1]-nums[0];
        for (int i = 0; i <= nums.length-k; i++)
        {
            int tmp=nums[i+k-1]-nums[i];
            result=Math.min(result,tmp);
        }
        return result;
    }
}
