import com.weng.ListNode;
import org.junit.Test;

public class NodeTest
{
    //java引用与赋值
    @Test
    public void testNodeNext()
    {
        ListNode dummyHead=new ListNode();
        ListNode newNode=new ListNode(10);
        newNode.next=dummyHead.next;
        dummyHead.next=newNode;
        System.out.println(newNode.next);
        System.out.println(dummyHead.next);

    }
}
