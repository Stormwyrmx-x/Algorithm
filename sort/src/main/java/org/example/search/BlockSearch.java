package org.example.search;

import org.example.entity.Block;

public class BlockSearch
{
    public static void main(String[] args)
    {
        int [] arr={16,5,9,12,21,18,
                    32,23,37,26,45,34,
                    50,48,61,52,73,66};
        Block b1=new Block(21,0,5);
        Block b2=new Block(45,6,11);
        Block b3=new Block(73,12,17);
        Block []blocks={ b1,b2,b3};
        int number=45;
        int index = getIndex(arr, blocks, number);
        System.out.println(index);

    }
    public static int getIndex(int[] arr, Block[] blocks, int number)
    {
        int blockIndex = getBlockIndex(blocks, number);
        if (blockIndex==-1)
        {
            return -1;
        }
        for (int i = blocks[blockIndex].getStartIndex(); i <= blocks[blockIndex].getEndIndex(); i++)
        {
            if (arr[i]==number)
            {
                return i;
            }

        }
        return -1;

    }
    public static int getBlockIndex(Block[] blocks, int number)
    {
        for (int i = 0; i < blocks.length; i++)
        {

            if (number<=blocks[i].getMax())
            {
                return i;
            }
        }
        return -1;
    }
}
