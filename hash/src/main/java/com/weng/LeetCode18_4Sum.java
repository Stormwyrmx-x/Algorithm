package com.weng;

import java.util.*;

public class LeetCode18_4Sum
{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>>result=new HashSet<>();

        for (int i = 0; i < nums.length; i++)
        {
//            if (nums[i]>0&&nums[i]>target)
//            {
//                break;
//            }
            if (i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            for (int j = i+1; j < nums.length; j++)
            {
                if (j>i+1&&nums[j]==nums[j-1])
                {
                    continue;
                }
                int left=j+1;
                int right=nums.length-1;
                while (left<right)
                {
                    if ((long)nums[i]+nums[j]+nums[left]+nums[right]>target)
                    {
                        right--;
                    }
                    else if ((long)nums[i]+nums[j]+nums[left]+nums[right]<target)
                    {
                        left++;
                    }
                    else
                    {
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}
