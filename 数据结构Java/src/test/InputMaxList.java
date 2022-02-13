package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lcd
 * @date 2021/11/9
 * @description 先通过Math.random（）方法产生一个随机的9位整数；再在其中插入4个乘号，使分得的5个整数的乘积最大；
 * 输入：正整数n；输出：被分得的5个整数、得到的最大乘积值。
 * @File MathRandom.java
 * Version jdk8
 */
public class InputMaxList {
    public static void main(String[] args) {
        //实例Scanner类对象
        Scanner sc = new Scanner(System.in);
        //创建一个长度为9的空数组
        int[] a = new int[9];
        //向数组中增减元素
        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
        }
        //迭代循环列表
        System.out.println("排序前的数组为：");
        for (int i : a) {
            System.out.print(i+" ");
        }
        //对数组进行排序(使用冒泡排序法进行倒序排序）
        int temp = 0;
        for (int i = 0; i < a.length -1; i++) {
            for (int j = 0; j < a.length -1 -i; j++) {
                if(a[j] < a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("\n 排序后的数组为：" +Arrays.toString(a));
        //将排序后的前五项相乘得到最大值
        int result = 1;
        for (int i = 0; i < 5; i++) {
           result *= a[i];
        }
        System.out.println(result);
    }
}
