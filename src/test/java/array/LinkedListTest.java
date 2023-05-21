package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.zac.array.LinkedList;

public class LinkedListTest {

    private LinkedList linkedList;
    @Before
    public void before() {
        linkedList = new LinkedList();
    }

    @Test
    public void testGetHead() {
        linkedList.addFront(1);
        Assert.assertEquals(1, linkedList.getHead());
    }

    @Test
    public void getGetLast() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(1, linkedList.getLast());

    }

    @Test
    public void testAddBack() {
        linkedList.addBack(1);
        linkedList.addBack(1);
        linkedList.addBack(3);
        Assert.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void testSize() {
        Assert.assertEquals(0, linkedList.size());
        linkedList.addFront(1);
        linkedList.addFront(2);
        Assert.assertEquals(2, linkedList.size());
        linkedList.addBack(3);
        Assert.assertEquals(3, linkedList.size());
    }

    @Test
    public void testClear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.addBack(4);
        linkedList.clear();
        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void testDelete() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.addBack(4);
        linkedList.delete(4);
        Assert.assertEquals(0, linkedList.size());
    }

}
