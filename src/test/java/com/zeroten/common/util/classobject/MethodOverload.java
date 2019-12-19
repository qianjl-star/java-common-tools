package com.zeroten.common.util.classobject;

import org.testng.annotations.Test;

public class MethodOverload {
    public void print() {
        System.out.println("无参数");
    }
    public void print(int num1) {
        System.out.println("一个参数");
        System.out.println("    参数为：" + num1);
    }
    public void print(int num1, int num2) {
        System.out.println("两个参数");
        System.out.println("    参数为：" + num1 + "," + num2);
    }
    public void print(String str) {
        System.out.println("字符串参数");
        System.out.println("    参数为：" + str);
    }
    @Test
    public void test() {
        print();
        print(0);
        print(0,1);
        print("string");
    }
}
