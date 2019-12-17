package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CheckUtilsTest {
    @Test
    public void testIsAnyEmpty(){
        String[] str0 = {null, "1"};
        String[] str1 = {"2",null, "1"};
        String[] str2 = {"2","", "1"};
        String[] str3 = {"", "1"};
        String[] str4 = {"1", "2"};

        Assert.assertEquals(CheckUtils.isAnyEmpty(str0), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(str1), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(str2), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(str3), false);
        Assert.assertEquals(CheckUtils.isAnyEmpty(str4), true);
    }

    @Test
    public void testIsEmpty(){
        Integer[] arr0 = null;
        Character[] arr1 = null;
        Boolean[] arr2 = null;
        String[] arr3 = null;
        Short[] arr4 = null;
        Long[] arr5 = null;
        Byte[] arr6 = null;
        Float[] arr7 = null;
        Double[] arr8 = null;

        Assert.assertEquals(CheckUtils.isEmpty(arr0), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr1), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr2), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr3), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr4), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr5), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr6), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr7), true);
        Assert.assertEquals(CheckUtils.isEmpty(arr8), true);
    }

    @Test
    public void testEquals(){
        Assert.assertEquals(CheckUtils.equals(null, null), false);
        Assert.assertEquals(CheckUtils.equals(null, "a"), false);
        Assert.assertEquals(CheckUtils.equals("a", null), false);
        Assert.assertEquals(CheckUtils.equals("a", "a"), true);
        Assert.assertEquals(CheckUtils.equals("a", "aa"), false);
        Assert.assertEquals(CheckUtils.equals(new String("ss"), new String("ss")), true);
        Assert.assertEquals(CheckUtils.equals(new String("ss"), new String("s")), false);
        /*
        相当于开辟了一个空间但是里面没有数据，有指向该空间的指针，为String str=""
        null表示没有指向堆中的内存地址
         */
        Assert.assertEquals(CheckUtils.equals(new String(), new String()), true);
        Assert.assertEquals(CheckUtils.equals(new String("a"), "a"), true);
    }
    @Test
    public void testEqualsInteger(){
        Assert.assertEquals(CheckUtils.equalsInteger(null, null), false);
        Assert.assertEquals(CheckUtils.equalsInteger(null, 1), false);
        Assert.assertEquals(CheckUtils.equalsInteger(1, null), false);
        Assert.assertEquals(CheckUtils.equalsInteger(1, 1), true);
        Assert.assertEquals(CheckUtils.equalsInteger(1, 11), false);
        Assert.assertEquals(CheckUtils.equalsInteger(new Integer(1), new Integer(1)), true);
        Assert.assertEquals(CheckUtils.equalsInteger(new Integer(1), new Integer(11)), false);
        /*
        为什么new String()可以
        new Integer()不可以
         */
//        Assert.assertEquals(CheckUtils.equalsInteger(new Integer(), new Integer()), true);
        Assert.assertEquals(CheckUtils.equalsInteger(new Integer(1), 1), true);
    }

    @Test
    public void testSort() {
        int[] array = {9,5,1,3,7,8,2,4,6};
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(Arrays.toString(CheckUtils.sort(array)), Arrays.toString(array1));
    }
}
