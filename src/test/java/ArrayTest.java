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
    public void test遍历1() {
        Integer[] arr = {1,2,3,4,5};
        /*
        注意不要下标越界
        快捷方法："".foramt
        for循环
         */
        for(int i=0; i<arr.length; i++) {
            System.out.println(String.format("下标：%d，存放的值：%d", i, arr[i]));
        }
    }

    @Test
    public void test遍历2() {
        Integer[] arr = {1,2,3,4,5};
        /*
        for each遍历
        for(数据类型 中间变量 : 数组)
         */
        int index = 1;
        for (int temp : arr) {
            System.out.println(String.format("第%d个值为：%d", index, arr[index-1]));
            index++;
        }
    }

    @Test
    public void test遍历3() {
        Integer[] arr = {1,2,3,4,5};
        /*
        Lambda遍历
        asList转换为集合
         */
        Arrays.asList(arr).forEach(val -> {
            if(val %2 == 0) {
                System.out.println(String.format("数值 %d 为偶数", val));
            }else {
                System.out.println(String.format("数值 %d 为奇数", val));
            }
        });
    }
}
