package com.zeroten.common.util.classobject;

import org.testng.annotations.Test;

public class ThisTest {
    public int num = 0;

    public ThisTest(int num) {
        this.num = num;
        System.out.println("this 赋值后成员变量为：" + num);
    }

    public static void main(String[] args) {
        ThisTest tt = new ThisTest(1);
    }
}
