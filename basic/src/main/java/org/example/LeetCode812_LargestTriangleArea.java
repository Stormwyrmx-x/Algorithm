package org.example;

public class LeetCode812_LargestTriangleArea
{
    //求最大三角形面积
    //points[0][0]表示的是第0个点的x坐标,points[0][1]表示的是第0个点的y坐标
    public double largestTriangleArea(int[][] points) {
        double result=0;
        //每3个点遍历
        for (int i = 0; i < points.length-2; i++)
        {
            for (int j = i+1; j < points.length-1; j++)
            {
                for (int k = j+1; k < points.length; k++)
                {
                    double triangleArea = calculateTriangleArea(points[i],points[j],points[k]);
                    result=Math.max(result,triangleArea);
                }
            }
        }
        return result;
    }
    //求三角形面积公式
    public double calculateTriangleArea(int[] point1, int[] point2, int[] point3)
    {
        return 0.5*Math.abs(point1[0]*point2[1]+point2[0]*point3[1]+point3[0]*point1[1]-point1[0]*point3[1]-point2[0]*point1[1]-point3[0]*point2[1]);
    }
}
