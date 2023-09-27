package com.weng;

public class LeetCode59_SpiralMatrix2
{
    //法一：卡哥法，每一次都固定个数
    public int[][] generateMatrix(int n) {
        int [][]result=new int[n][n];
        int startX=0,startY = 0,i,j;//i和startX是行，j和startY是列
        int count=1;//负责赋值
        int offset=1;
        int loop=n/2;//记录总共要循环多少次
        while (loop-->0)
        {
            for (j=startY;j<n-offset;j++)
            {
                result[startX][j]=count++;
            }
            for (i=startX;i<n-offset;i++)
            {
                result[i][j]=count++;
            }
            for (;j>startY;j--)
            {
                result[i][j]=count++;
            }
            for (;i>startX;i--)
            {
                result[i][j]=count++;
            }
            startX++;
            startY++;
            offset++;
        }
        if (n%2==1)
        {
            result[n/2][n/2]=count;
        }

        return result;
    }

    //法二：力扣大神法，定义上下左右
    public int[][] generateMatrix_Method2(int n) {
        int [][]result=new int[n][n];
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int count=1;
        while (true)
        {
            for (int j = left; j <= right; j++)
            {
                result[top][j]=count++;
            }
            top++;
            if (top>bottom)
            {
                break;
            }
            for (int i=top;i<=bottom;i++)
            {
                result[i][right]=count++;
            }
            right--;
            if (right<left)
            {
                break;
            }
            for (int j=right;j>=left;j--)
            {
                result[bottom][j]=count++;
            }
            bottom--;
            if (top>bottom)
            {
                break;
            }
            for (int i=bottom;i>=top;i--)
            {
                result[i][left]=count++;
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
