import org.junit.Test;

public class CodePointTest
{
    @Test
    public void testCodePoint()
    {
        String s = "Hello, 汉世界!";

        // 输出每个字符的码点
        for (int i = 0; i < s.length(); i++) {
            int codePoint = s.codePointAt(i);
            System.out.println("Character: " + s.charAt(i) + ", Code Point: " + codePoint);
        }

        // 输出每个字符的代码单元
        for (int i = 0; i < s.length(); i++) {
            char codeUnit = s.charAt(i);
            System.out.println("Character: " + s.charAt(i) + ", Code Unit: " + (int) codeUnit);
        }
    }
    
}
