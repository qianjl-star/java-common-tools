// 包定义
package com.zeroten.common.util.classobject;

// 包导入
import org.testng.annotations.Test;

public class ClassContains {
    // 类中的数据 - 变量
    public static String varStatic = "类变量、静态域";
    public String var = "实例变量、域";

    // 代码块
    {
        System.out.println("代码块使用的位置：");
        System.out.println("1. 类中、方法外");
        System.out.println("2. 方法中");
    }
    {
        System.out.println("实例代码块、初始化代码块");
    }
    static {
        System.out.println("静态代码块、静态初始化代码块");
    }

    // 构造方法 - 类名同名、无返回值
    public ClassContains() {
        System.out.println("构造器方法");
    }

    // 内部类
    class InnerClass {}

    // 对象的行为 - 方法
    public static void methodStatic() {
        System.out.println("静态方法");
    }
    public void method() {
        System.out.println("方法");
    }
}
