import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

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

    @Test
    public void test数组拷贝1() {
        int[] arr1 = {1,2,3,4,5};

        int[] arr3 = new int[3];
        arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];
        System.out.println(Arrays.toString(arr3));
    }

    @Test
    public void test数组拷贝2() {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void test数组拷贝3() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOfRange(arr1, 1, arr1.length);
        /*
        不会出现越界
        不包含最后一个索引的数值，为 <to
        新生成的数组中不包含arr1[arr1.length]
        from <= index < to
        数组下标从0开始
         */
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void test数组拷贝4() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.arraycopy(arr2, arr2.length-3, arr1, arr1.length-3, 3);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void test数组填充() {
        int[] arr = new int[6];
        Arrays.fill(arr, 6);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, arr.length-3, arr.length, 3);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test数组排序() {
        int[] arr = new int[100];
        for (int i=0; i<100; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        /*
        永久排序，不是临时
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
     public void test多维数组() {
        /*
        第一维数组必须指定长度
        多维数组的不同维度之间数据类型也应该相同
         */
        String[][] users = new String[5][];
        users[0] = new String[] {"001", "张三", "男", "24"};
        users[1] = new String[] {"002", "李四", "女", "20"};
        users[2] = new String[4];
        users[2][0] = "003";
        users[2][1] = "王五";
    }

    @Test
    public void test多维数组打印() {
        String[][] users = new String[5][];
        users[0] = new String[] {"001", "张三", "男", "24"};
        users[1] = new String[] {"002", "李四", "女", "20"};

        System.out.println("for循环打印：");
        for(int index=0; index<users.length; index++) {
            System.out.println(Arrays.toString(users[index]));
        }
    }

    @Test
    public void test多维数组打印2() {
        String[][] users = new String[5][];
        users[0] = new String[] {"001", "张三", "男", "24"};
        users[1] = new String[] {"002", "李四", "女", "20"};

        System.out.println("for each打印：");
        for (String[] user : users) {
            System.out.println(Arrays.toString(user));
        }
    }

    @Test
    public void test多维数组打印3() {
        String[][] users = new String[5][];
        users[0] = new String[] {"001", "张三", "男", "24"};
        users[1] = new String[] {"002", "李四", "女", "20"};
        /*
        user表示在集合中的每一个元素的中间变量
         */
        System.out.println("Lambda打印：");
        Arrays.asList(users).forEach(user -> System.out.println(Arrays.toString(user)));
    }

    public int[] twoSum(int[] arr, int target) {
        System.out.println("随机生成的数组为：" + Arrays.toString(arr));
        System.out.println("随机生成的目标数为" + target);
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
    @Test
    public void test应用练习() {
        int[] arr = new int[15];
        for (int index=0; index<arr.length; index++) {
            arr[index] = new Random().nextInt(10);
        }
        int target = new Random().nextInt(20);
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
