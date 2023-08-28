package org.example;

public class LeetCode292_NimGame
{
    //不需要动态规划，如果轮到你的时候是4的倍数。那么你就输了
    public boolean canWinNim(int n) {
        return n%4!=0;
    }


}
