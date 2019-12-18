package com.zeroten.common.util.classobject;

public class VarTest {
    // 实例中共享
    public static int count = 0;
    // 每个实例中单独拷贝
    public int index = 0;

    /*
    变量初始值都为 0
    创建两个实例，每一个实例都对两个变量进行 +1 操作
    比较有无 static 修饰的变量之间的区别
     */
    public static void main(String[] args) {
        VarTest vt1 = new VarTest();
        vt1.count++;
        vt1.index++;
        System.out.println("vt1中：");
        System.out.println("    static 修饰：" + vt1.count);
        System.out.println("    无 static 修饰：" + vt1.index);

        VarTest vt2 = new VarTest();
        vt2.count++;
        vt2.index++;
        System.out.println("vt2中：");
        System.out.println("    static 修饰：" + vt2.count);
        System.out.println("    无 static 修饰：" + vt2.index);
    }
}
