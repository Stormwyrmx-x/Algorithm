package org.example;

import java.util.HashMap;
import java.util.Map;

public class Offer39_MajorityElement
{
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        Integer max=0;
        Integer element = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue()>max)
            {
                element=entry.getKey();
                max=entry.getValue();
            }
        }
        return element;
    }
}
