package unit;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import unit.SequenceAlgorithm;

public class AlgorithmTest extends TestCase {
    int arr[];
    SequenceAlgorithm sa;
    int result[];
    String string;

    //初始化参数
    @Override
    protected void setUp() throws Exception {
        //super.setUp();
        arr = new int[]{1, 2, 5, 4, 3};
        sa = new SequenceAlgorithm();
    }

    @Test
    // 测试数组转化成字符串
    public void testArrayTransferString(){
        string = sa.ArrayTransferString(arr);
        System.out.println(string);
    }

    @Test
    // 测试冒泡排序
    public void testBubbleSort(){
        result = sa.BubbleSort(arr);
        System.out.println(sa.ArrayTransferString(result));
        Assert.assertEquals("1,2,3,4,5",sa.ArrayTransferString(result));
        Assert.assertEquals("5,4,3,2,1",sa.ArrayTransferString(result));
    }

    @Test
    //测试选择排序
    public void testSelectSort(){
        result = sa.SelectSort(arr);
        System.out.println(sa.ArrayTransferString(result));
        Assert.assertTrue(sa.ArrayTransferString(result).equals("1,2,3,4,5"));
    }

    @Test
    //测试插入排序
    public void testInsertSort(){
        result = sa.InsertSort(arr);
        System.out.println(sa.ArrayTransferString(result));
    }

    @Test
    //测试希尔排序
    public void testShellSort(){
        result = sa.ShellSort(arr);
        System.out.println(sa.ArrayTransferString(result));
    }
}
