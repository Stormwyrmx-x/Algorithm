package org.example;

public class LeetCode66_MySqrt
{

    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int) sqrt;
        //使用二分查找，二分查找好难，不会，555
//        int left=0;
//        int right=x;
//        int mid;
//        while (left<right-1)
//        {
//            mid=(left+right)/2;
//            if (mid*mid==x)
//            {
//                return mid;
//            }
//            else if (Math.pow(mid,2)<x)
//            {
//                left=mid;
//            }
//            else
//            {
//                right=mid;
//            }
//        }
//        return 0;
    }
}
