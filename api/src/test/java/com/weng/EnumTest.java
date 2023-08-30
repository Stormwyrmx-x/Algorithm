package com.weng;

import com.weng.enumration.OperationType;
import org.junit.Test;

public class EnumTest
{
    @Test
    public void test()
    {
        girl(OperationType.TIETIE);

    }

    public void girl(OperationType operationType)
    {
        switch (operationType)
        {
            case TIETIE -> System.out.println("女孩子贴贴~");
            case BAOBAO -> System.out.println("baobao");
            case WENWEN -> System.out.println("xiangxiang");
        }
    }

}
