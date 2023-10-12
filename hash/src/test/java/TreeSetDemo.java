import com.weng.entity.ClassMate;
import com.weng.entity.Student;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetDemo
{
    @Test
    public void exam1()
    {
        ClassMate hu=new ClassMate("husiqi",21, 91.0,93D, 90.0);
        ClassMate yang=new ClassMate("yang",20, 92.0,90D, 90.0);
        ClassMate weng=new ClassMate("weng",22, 90.0,92D, 90.0);
        ClassMate jl=new ClassMate("weng",22, 90.0,92D, 90.0);

        TreeSet<ClassMate>treeSet=new TreeSet<>((o1, o2) -> {
            double difference = o2.getChineseScore() + o2.getMathScore() + o2.getEnglishScore() - o1.getChineseScore() - o1.getMathScore() - o1.getEnglishScore();
            if (difference==0)
            {
                difference=o2.getChineseScore()-o1.getChineseScore();
                if (difference==0)
                {
                    difference=o2.getMathScore()-o1.getMathScore();
                    if (difference==0)
                    {
                        difference=o2.getEnglishScore()-o1.getEnglishScore();
                        if (difference==0)
                        {
                            difference=o2.getAge()-o1.getAge();
                            if (difference==0)
                            {
                                difference=o2.getName().compareTo(o1.getName());
                                if (difference==0)
                                {
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
            return (int) difference;
        });

        treeSet.add(hu);
        treeSet.add(yang);
        treeSet.add(weng);
        treeSet.add(jl);

        System.out.println(treeSet);
    }

}
