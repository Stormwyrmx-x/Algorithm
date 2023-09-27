package com.weng;

public class LeetCode977_SortedSquares
{
    public int[] sortedSquares(int[] nums) {
        //双指针法，因为最大的平方只会存在于左右两侧
        int[]result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=result.length-1;
        while (left<=right)
        {
            if (Math.pow(nums[left],2)<=Math.pow(nums[right],2))
            {
                result[index]= (int) Math.pow(nums[right],2);
                right--;
                index--;
            }
            else
            {
                result[index]= (int) Math.pow(nums[left],2);
                index--;
                left++;
            }
        }
        return result;
    }
}
