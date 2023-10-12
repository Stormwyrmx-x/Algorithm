import com.weng.entity.Girl;
import org.junit.Test;

import java.util.*;

public class HashSetDemo
{
    @Test
    public void testGirl()
    {
        Girl hu=new Girl("husiqi",21);
        Girl yang=new Girl("yangsihui~",20);
        Girl mi=new Girl("misaka~",16);
        Girl hu2=new Girl("husiqi~",21);
        HashSet<Girl>hashSet=new LinkedHashSet<>();
        hashSet.add(mi);
        hashSet.add(hu);
        hashSet.add(yang);
        hashSet.add(hu2);
        for (Girl girl : hashSet)
        {
            System.out.println(girl);
        }
        System.out.println(hashSet);


        System.out.println(hu.hashCode());
        System.out.println(hu2.equals(hu));
        System.out.println(hu2.hashCode());
        System.out.println(yang.hashCode());
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }

    @Test
    public void testTreeSet()
    {
        Girl hu=new Girl("husiqi",21);
        Girl yang=new Girl("yangsihui~",20);
        Girl mi=new Girl("misaka~",16);
        Girl hu2=new Girl("husiqi~",21);
        TreeSet<Girl>treeSet=new TreeSet<>();
        treeSet.add(hu);
        treeSet.add(yang);
        treeSet.add(mi);
        treeSet.add(hu2);
        System.out.println(treeSet);
    }

}
