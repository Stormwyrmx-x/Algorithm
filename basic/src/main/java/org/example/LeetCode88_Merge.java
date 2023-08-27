package org.example;

import java.util.Arrays;

public class LeetCode88_Merge
{
    //先合并再排序
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
