package org.example.search;

import org.example.entity.BlockRange;

public class BlockSearchExtended
{
    public static void main(String[] args)
    {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};
        BlockRange blockRange1=new BlockRange(22,40,0,4);
        BlockRange blockRange2=new BlockRange(13,20,5,8);
        BlockRange blockRange3=new BlockRange(7,10,9,10);
        BlockRange blockRange4=new BlockRange(43,50,11,13);
        BlockRange[]blockRanges={blockRange1,blockRange2,blockRange3,blockRange4};
        int number=19;
        int index = getIndex(arr, blockRanges, number);
        System.out.println(index);

    }

    public static int getIndex(int[] arr, BlockRange[] blockRanges, int number)
    {
        int blockIndex = getBlockIndex(blockRanges, number);
        for (int i = blockRanges[blockIndex].getStartIndex(); i <=blockRanges[blockIndex].getEndIndex() ; i++)
        {
            if (arr[i]==number)
            {
                return i;
            }
        }
        return -1;
    }
    public static int getBlockIndex(BlockRange[] blockRanges, int number)
    {
        for (int i = 0; i < blockRanges.length; i++)
        {
            if (number>=blockRanges[i].getMin()&&number<=blockRanges[i].getMax())
            {
                return i;
            }
        }
        return -1;

    }
}
