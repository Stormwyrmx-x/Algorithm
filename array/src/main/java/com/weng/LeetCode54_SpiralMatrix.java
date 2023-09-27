package com.weng;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54_SpiralMatrix
{
    //定义上下左右四个边界，每次循环都改变边界。不断向中心靠拢
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result=new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while (true)
        {
            for (int j = left; j <= right; j++)
            {
                result.add(matrix[top][j]);
            }
            top++;
            if (top>bottom)
            {
                break;
            }
            for (int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            if (right<left)
            {
                break;
            }
            for (int j=right;j>=left;j--)
            {
                result.add(matrix[bottom][j]);
            }
            bottom--;
            if (bottom<top)
            {
                break;
            }
            for (int i=bottom;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            if (left>right)
            {
                break;
            }
        }

        return result;
    }
}
