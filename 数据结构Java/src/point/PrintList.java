package point;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lcd
 * @date 2021/11/9
 * @description  以多种方式遍历列表中的值
 * @File PrintList.java
 * Version jdk8
 */
public class PrintList {
    public static void main(String[] args) {
        //创建一个列表,列表长度为10
        int[] a = new int[10];
        //实例化一个random对象
        Random random = new Random();
        //向列表中填充随机数
        for (int i = 0; i < a.length; i++) {
            //获取的随机数区间为[1,20)
            a[i] = random.nextInt(20)+1;
        }
        //遍历数组中的数据
        System.out.println("使用Arrays中的toString()方法获取列表中的值：\n"+Arrays.toString(a));
        //使用for循环遍历数组
        System.out.println("使用for循环遍历数组中的数据：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //使用迭代器迭代遍历数组
        System.out.println("\n使用迭代器迭代数组中的数据");
        for (int s:a
             ) {
            System.out.print(s+" ");
        }

    }
}
