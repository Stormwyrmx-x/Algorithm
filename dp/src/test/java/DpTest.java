import org.junit.Test;

import java.util.Scanner;

public class DpTest
{
    public static void main(String[] args)
    {
//        Scanner in=new Scanner(System.in);
//        while(in.hasNextLine())
//        {
//            String line=in.nextLine();
//            String[]nums=line.split(" ");
//            int sum=0;
//            for (int i=0; i<nums.length; i++)
//            {
//                sum+=Integer.parseInt(nums[i]);
//            }
//            System.out.println(sum);
//        }

        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }

    @Test
    public void testFor()
    {
        for (int i = 1; i !=1 ; i++)
        {
            System.out.println(i);
        }
    }
}
