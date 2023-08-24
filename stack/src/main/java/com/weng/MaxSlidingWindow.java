package com.weng;

import java.util.*;

public class MaxSlidingWindow
{
    public static void main(String[] args)
    {
        int []nums={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k)
    {
        Deque<Integer>deque=new LinkedList<>();
        int[]result = new int[nums.length-k+1];
        for (int i=0;i<k;i++)
        {
            deque.addLast(nums[i]);
        }
        result[0]=Collections.max(deque);
        for (int i = k; i < nums.length; i++)
        {
            deque.removeFirst();
            deque.addLast(nums[i]);
            result[i-k+1]= Collections.max(deque);
        }
        return result;
    }
}
