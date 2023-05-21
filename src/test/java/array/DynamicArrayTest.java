package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.zac.array.DynamicArray;

public class DynamicArrayTest {

    private DynamicArray dynamicArray;

    @Before
    public void before() {
        dynamicArray = new DynamicArray<String>(2);
    }

    @Test
    public void testGetSet() {
        dynamicArray.set(0, "a");
        Assert.assertEquals("a", dynamicArray.get(0));
    }

    @Test
    public void testInsert() {
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");

        dynamicArray.insert(3, "d");

        Assert.assertEquals("a", dynamicArray.get(0));
        Assert.assertEquals("b", dynamicArray.get(1));
        Assert.assertEquals("c", dynamicArray.get(2));
        Assert.assertEquals("d", dynamicArray.get(3));

    }

    @Test
    public void testDelete() {
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.add("d");
        dynamicArray.add("e");
        dynamicArray.add("f");
        dynamicArray.add("g");
        dynamicArray.add("h");
        dynamicArray.delete(2);
        Assert.assertEquals("d", dynamicArray.get(2));

    }

    @Test
    public void testContains() {
        dynamicArray.add("a");
        Assert.assertTrue(dynamicArray.contains("a"));
        Assert.assertFalse(dynamicArray.contains("b"));
    }

}
