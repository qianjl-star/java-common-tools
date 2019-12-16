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

}
