package com.weng;

import java.util.Arrays;

public class LeetCode209_MinSubArray
{
    //滑动窗口，本质上也是双指针法。定义一个起始位置和一个终止位置
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;//起始位置
        int sum=0;
        int subLength=0;
        int result=Integer.MAX_VALUE;//最终结果
        for (int j = 0; j < nums.length; j++)//终止位置
        {
            sum+=nums[j];
            while (sum>=target)
            {
                subLength=j-i+1;
                result=Math.min(result,subLength);
                sum-=nums[i];
                i++;
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
