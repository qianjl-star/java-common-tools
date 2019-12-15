import org.testng.annotations.Test;

import java.util.Arrays;

public class StringTest {
    @Test
    public void test() {
        String str1 = new String("Hello");
        String str2 = "Hello";
        System.out.println(str1 == str2);
        String str3 = str1.intern();
        System.out.println(str2 == str3);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        String str4 = "hello " + "world";
        String str5 = "hello world";
        System.out.println(str4 == str5);
    }

    @Test
    public void testLength() {
        String str = "Hello world!";
        System.out.println(str.length());
        System.out.println(str.codePointCount(0, str.length()));
    }

    @Test
    public void testSubstring() {
        String str = "hello world";
        System.out.println(str.substring(5));
    }
    @Test
    public void test字符串拼接() {
        String str = "hello " + "world";
        String str1 = str + ".2019";
    }

    @Test
    public void foramt() {
        String str = String.format("大写a: %c %n", 'A');
        String str1 = String.format("大写a: %s \n", 'A');
        String str2 = String.format("大写a的ASCII码值: %d %n", (int)'A');
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }

    @Test
    public void testju() {
        String str = "hello";
        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("o"));
        System.out.println(str.contains("l"));
    }

    @Test
    public void testFind() {
        String str = "sdfwasgdsfhgfdgjretuhyd";
        /*
        从0开始找，包含0，返回第一个
         */
        int n = str.indexOf("s", 0);
        System.out.println(n);

        int index = str.length();
        do {
            int tmp = str.lastIndexOf("s", index-1);
            if (tmp == -1)
                break;
            System.out.println(tmp);
            index = tmp;
        }while (true);
    }

    @Test
    public void testSize() {
        StringBuilder sb = new StringBuilder(10);
        /*
        后面带有扩容
         */
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.append("!");
        System.out.println(sb.toString());

        sb.setLength(10);
        System.out.println(sb.toString());

        sb.setLength(20);
        System.out.println(sb.toString());
    }

    @Test
    public void testRunTime() {
        long start = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder sb =new StringBuilder();
        for (int index=0; index<20000; index++){
            sb.append(index);
        }
        System.out.println(sb.length());
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    @Test
    public void testStringPrint() {
        String str = "hello";
        System.out.println(str);
    }
}
