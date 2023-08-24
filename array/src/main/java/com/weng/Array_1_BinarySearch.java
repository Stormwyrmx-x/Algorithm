package com.weng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_1_BinarySearch
{
    public int search(int[] nums, int target) {
        int min=0;
        int max=nums.length-1;
        int mid=(min+max)/2;
        while(min<=max)
        {
            mid=(min+max)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                min=mid+1;
            }
            else if(nums[mid]>target)
            {
                max=mid-1;
            }
        }
        return -1;

    }

}
