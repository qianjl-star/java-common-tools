package com.zeroten.common.util.classobject;

import org.testng.annotations.Test;
import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Method {
    private int count;
    private int index;

    // 方法的使用
    public void println() {
        // 字符串的格式化，不是C语言中输出时的那种，虽然格式相似
        // 在此处是将其存储为字符串，而不是按照此种格式进行输出
        String logStr = String.format("此处为打印整型数值：count = %d, index = %d.", count, index);
        System.out.println(logStr);
    }
    public static void printlnStatic() {
        System.out.println("静态方法");
    }
    public static void main(String[] args) {
        Method met = new Method();
        met.println();
        // 静态方法不需要实例化对象
        printlnStatic();
    }

    // 方法参数的使用
    public void param(int num) {
        System.out.println("    未做修改的数值：" + num);
        num = 11;
        System.out.println("    在方法中修改后的数值：" + num);
    }
    public void refer(StringBuilder sb) {
        System.out.println("    " + sb.toString());
        sb.delete(0, 7);
        sb.append("在方法中修改后的字符串");
        System.out.println("    " + sb.toString());
    }
    @Test
    public void testParam() {
        Method method = new Method();
        System.out.println("基本数据类型在方法中做修改：");
        int num = 1;
        method.param(num);
        System.out.println("    使用方法修改后的数值：" + num);
//        System.out.println(count);

        System.out.println("引用类型在方法中做修改：");
        StringBuilder sb = new StringBuilder("修改前的字符串");
        method.refer(sb);
        System.out.println("    " + sb.toString());
    }
    // 引用类型也可借用整型数组
    @Test
    public void test(){
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        System.out.println(Arrays.toString(arr));
    }

    // 可变参数
    public void varParams(int[] arr, int... var) {
        System.out.println("数组为：");
        for(int temp : arr) {
            System.out.print("    " + temp);
        }
        System.out.println();
        System.out.println("可变参数为：");
        for(int temp : var) {
            System.out.print("    " + temp);
        }
    }
    @Test
    public void varParamsTest() {
        varParams(new int[]{1,2,3}, 4,5,6);
    }
}
