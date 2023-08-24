package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode2022_Construct2DArray
{
    public int[][] construct2DArray(int[] original, int m, int n)
    {
        int[][] array = new int[m][n];
        if (m * n != original.length)
        {
            return new int [0][0];
        }
        for (int i = 0; i < m; i++)
        {
            int[] copy = Arrays.copyOfRange(original, i * n, (i + 1) * n );
            array[i] =copy;
        }
        return array;
    }
}
