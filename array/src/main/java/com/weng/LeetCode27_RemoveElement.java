package com.weng;

import java.util.Arrays;

public class LeetCode27_RemoveElement
{
    public int removeElement(int[] nums, int val) {
        //法一：暴力双层for循环
//        int size=nums.length;
//        for (int i = 0; i < nums.length; i++)
//        {
//            if (nums[i]==val)
//            {
//                for (int j = i; j < nums.length-1; j++)
//                {
//                    nums[j]=nums[j+1];
//                }
//            }
//            i--;
//            size--;
//        }
//        return size;

        //法二：双指针法，快指针表示寻找新数组的元素，慢指针是指向更新新数组下标的位置
        int slow=0;
        for (int fast = 0; fast < nums.length; fast++)
        {
            if (nums[fast]!=val)
            {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
