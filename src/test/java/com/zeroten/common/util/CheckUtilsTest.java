package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

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
}
