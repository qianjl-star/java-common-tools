package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {
    @Test
    public void testTrimAll() {
        String str = "hello";

        Assert.assertEquals(StringUtils.trimAll(" hello"), str);
        Assert.assertEquals(StringUtils.trimAll("    hello"), str);
        Assert.assertEquals(StringUtils.trimAll("hello "), str);
        Assert.assertEquals(StringUtils.trimAll("hello    "), str);
        Assert.assertEquals(StringUtils.trimAll("hel lo"), str);
        Assert.assertEquals(StringUtils.trimAll("he   llo"), str);
        Assert.assertEquals(StringUtils.trimAll("  he   llo   "), str);
    }
}
