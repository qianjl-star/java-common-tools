package com.zeroten.common.util.classobject;

public class Constructor {
    public static int count = 0;
    public static int index = 1;
    {}
    // 构造器、构造方法
    public Constructor() {
        System.out.println("无参构造");
    }
    public Constructor(int count) {
        this();
        System.out.println("有参构造 1");
        System.out.println("    传入的 count：" + count);
        System.out.println("    类状态/属性 count：" + this.count);
        this.count = count;
        // this 返回的是当前类的对象，下面两句与上面的等值
//        Constructor con = new Constructor();
//        con.count = count;
    }
    public Constructor(int count, int index) {
        this(count);
        this.index = index;
        System.out.println("有参构造 2");
        System.out.println("    嵌套 this 调用");
    }

    // 方法，可以与类名相同
    public void Constructor() {
    }

    public static void main(String[] args) {
        // 构造方法不能直接引用，在创建类的时候使用
        Constructor con1 = new Constructor();
        System.out.println();

        Constructor con2 = new Constructor(11);
        System.out.println("    this 赋值域变量后类状态/属性 count：" + Constructor.count);
        System.out.println();

        Constructor con3 = new Constructor(33, 34);
        System.out.println("    count :" + Constructor.count);
        System.out.println("    index :" + Constructor.index);
    }
}
