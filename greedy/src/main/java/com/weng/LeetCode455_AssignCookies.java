package com.weng;

import java.util.Arrays;

public class LeetCode455_AssignCookies
{
    //这里的局部最优就是大饼干喂给胃口大的，充分利用饼干尺寸喂饱一个，全局最优就是喂饱尽可能多的小孩。
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for (int i = 0,j=0; i < s.length&&j<g.length; i++)
        {
            if (s[i]>=g[j])
            {
                count++;
                j++;
            }
        }
        return count;
    }
}
