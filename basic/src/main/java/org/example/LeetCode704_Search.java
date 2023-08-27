package org.example;

import java.util.Arrays;

public class LeetCode704_Search
{
    //二分查找
    public int search(int[] nums, int target) {
//        int i = Arrays.binarySearch(nums, target);
//        if (i<0)
//        {
//            return -1;
//        }
//        return i;
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while(left<=right)
        {
            if(target<nums[mid])
            {
                right=mid-1;
                mid=(left+right)/2;
            }
            else if(target>nums[mid])
            {
                left=mid+1;
                mid=(left+right)/2;
            }
            else if(target==nums[mid])
            {
                return mid;
            }
        }
        return -1;
    }
}
