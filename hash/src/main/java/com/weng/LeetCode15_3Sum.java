package com.weng;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode15_3Sum
{
    //双指针法
    //left 定义在i+1的位置上，定义下标right 在数组结尾的位置上。
    //如果nums[i] + nums[left] + nums[right] > 0 就说明 此时三数之和大了，因为数组是排序后了，所以right下标就应该向左移动，这样才能让三数之和小一些。
    //如果 nums[i] + nums[left] + nums[right] < 0 说明 此时 三数之和小了，left 就向右移动，才能让三数之和大一些，直到left与right相遇为止。
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>result=new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            //不能有重复的三元组，但三元组内的元素是可以重复的
            if (i>0&&nums[i]==nums[i-1])
            {
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while (left<right)
            {
                if (nums[i]+nums[left]+nums[right]>0)
                {
                    right--;
                }
                else if (nums[i]+nums[left]+nums[right]<0)
                {
                    left++;
                }
                else
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                    while (nums[right]==nums[right-1]&&left<right)
//                    {
//                        right--;
//                    }
//                    while (nums[left]==nums[left+1]&&left<right)
//                    {
//                        left++;
//                    }
                    right--;
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }

    //答案中不可以包含重复的三元组
    public List<List<Integer>> threeSum_OverTime(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>result=new HashSet<>();
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                for (int k = j+1; k < nums.length; k++)
                {
                    if (nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer>path=new ArrayList<>();
                        Collections.addAll(path,nums[i],nums[j],nums[k]);
                        result.add(new ArrayList<>(path));
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
}
