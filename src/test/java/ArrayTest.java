import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testArrrayDeclare() {
        int[] array;
        String[] str;
    }

    @Test
    public void test无值初始化() {
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

        String[] str = new String[3];
        System.out.println(Arrays.toString(str));

        boolean[] flag;
        flag = new boolean[3];
        System.out.println(Arrays.toString(flag));

        Object[] oj = new Object[3];
        System.out.println(Arrays.toString(oj));
    }

    @Test
    public void test有值初始化() {
        int[] array = new int[] {1,2,3};
        System.out.println(Arrays.toString(array));

        String[] str = {"char", null, ""};
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void test() {}
}
